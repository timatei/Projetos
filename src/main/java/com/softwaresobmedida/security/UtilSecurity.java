package com.softwaresobmedida.security;

import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UtilSecurity {
	/**
	 * This method returns the principal[user-name] of logged-in user.
	 */
	public static String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
	

	public static String getBancoAtual(){
		String banco = "MASTER";
		
		if ((SecurityContextHolder.getContext() != null) && (SecurityContextHolder.getContext().getAuthentication() != null)) {
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
			if (principal != null) {
				if (principal instanceof UserDetailsModify) {
					banco = ((UserDetailsModify)principal).getDataBaseName();
				}
			}
		}
		
		return banco;
	}
	
	
	/**
	 * This method returns true if users is already authenticated [logged-in], else false.
	 */
	public static boolean isCurrentAuthenticationAnonymous(AuthenticationTrustResolver authenticationTrustResolver) {
	    final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    return authenticationTrustResolver.isAnonymous(authentication);
	}
}
