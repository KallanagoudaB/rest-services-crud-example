package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.entity.User;

public interface UserService {
	
	User createUser(User user);
	List<User> getAllUsers();
	User getUserById(Integer id);
	User updateUser(User user);
	void deleteUser(Integer id);

}
