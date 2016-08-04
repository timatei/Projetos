package com.softwaresobmedida.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.UserProfileService;
import com.softwaresobmedida.service.UserService;

import ssm.softwaresobmedida.framework.User;
import ssm.softwaresobmedida.framework.UserProfile;

@Controller
@RequestMapping("/user")
@SessionAttributes("roles")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	UserProfileService userProfileService;
	
	@Autowired
	MessageSource messageSource;

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listUsers(
			final ModelMap model) 
	{
		List<User> users = userService.findAllUsers();
		model.addAttribute("users", users);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "user/user-list";
	}

	/**
	 * This method will provide the medium to add a new user.
	 */
	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(
			final ModelMap model) 
	{
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "user/user-registration";
	}

	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(
			@Valid User user, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "user/user-registration";
		}

		/*
		 * Preferred way to achieve uniqueness of field [sso] should be implementing custom @Unique annotation 
		 * and applying it on field [sso] of Model class [User].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "user/user-registration";
		}
		
		userService.saveUser(user);

		redirectAttributes.addFlashAttribute("success", user.getFirstName() + " "+ user.getLastName() + " cadastrado com sucesso!");
		return "redirect:/user/list";
	}

	/**
	 * This method will provide the medium to update an existing user.
	 */
	@RequestMapping(value = { "/edit-user-{ssoId}" }, method = RequestMethod.GET)
	public String editUser(
			@PathVariable String ssoId, 
			final ModelMap model) 
	{
		User user = userService.findBySSO(ssoId);
		model.addAttribute("user", user);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "user/user-registration";
	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-user-{ssoId}" }, method = RequestMethod.POST)
	public String updateUser(
			@Valid User user, 
			@PathVariable String ssoId,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "user/user-registration";
		}

		/*//Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}*/

		userService.updateUser(user);

		redirectAttributes.addFlashAttribute("success", user.getFirstName() + " "+ user.getLastName() + " atualizado com sucesso!");
		return "redirect:/user/list";
	}
	
	/**
	 * This method will delete an user by it's SSOID value.
	 */
	@RequestMapping(value = { "/delete-user-{ssoId}" }, method = RequestMethod.GET)
	public String deleteUser(
			@PathVariable String ssoId,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", ssoId + " deletado com sucesso!");
		userService.deleteUserBySSO(ssoId);
		return "redirect:/user/list";
	}

	/**
	 * This method will provide UserProfile list to views
	 */
	@ModelAttribute("roles")
	public List<UserProfile> initializeProfiles() {
		return userProfileService.findAll();
	}
}