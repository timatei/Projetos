package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
