package com.jpa.springboot.service;

import java.util.Map;

import com.jpa.springboot.model.User;

public interface UserService {
	
	public User login(Map<String, String> map) throws Exception;
}
