package com.softwaresobmedida.dao;

import java.util.List;

import ssm.softwaresobmedida.framework.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
