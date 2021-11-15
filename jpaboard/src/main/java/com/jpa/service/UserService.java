package com.jpa.service;

import java.util.Map;

import com.jpa.model.User;

public interface UserService {
	
	public User login(Map<String, String> map) throws Exception;
}
