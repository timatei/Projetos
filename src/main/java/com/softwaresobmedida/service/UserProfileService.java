package com.softwaresobmedida.service;

import java.util.List;

import ssm.softwaresobmedida.framework.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
