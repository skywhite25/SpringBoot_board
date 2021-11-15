package com.jpa.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jpa.model.User;

@Mapper
@Repository
public interface UserMapper {
	
	public User login(Map<String, String> map);
	
}
