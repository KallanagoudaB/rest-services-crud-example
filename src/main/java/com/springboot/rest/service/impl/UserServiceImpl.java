package com.springboot.rest.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.entity.User;
import com.springboot.rest.exception.ResourceNotFoundExcepion;
import com.springboot.rest.repository.UserRepository;
import com.springboot.rest.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findById(id).orElseThrow(
				()->  new ResourceNotFoundExcepion("User", "id", id));
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
	}

}
