package com.eric.springmvc.service;

import java.util.List;

import com.eric.springmvc.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
