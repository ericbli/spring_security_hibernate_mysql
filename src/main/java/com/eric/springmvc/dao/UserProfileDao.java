package com.eric.springmvc.dao;

import java.util.List;

import com.eric.springmvc.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
