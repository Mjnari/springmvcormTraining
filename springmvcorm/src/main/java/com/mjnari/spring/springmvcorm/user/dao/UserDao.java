package com.mjnari.spring.springmvcorm.user.dao;

import java.util.List;

import com.mjnari.spring.springmvcorm.user.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
	User findUser(Integer id);
}
