package com.springboot.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entity.User;
import com.springboot.rest.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
@Tag(name = "REST API to expose User resource",
description = "CRUD operations for User resource")
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
	
	UserService userService;
	@Operation(description = "Used to create User in to database")
	@ApiResponse(responseCode = "201 USER CREATED")
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		return new ResponseEntity<User>(createdUser,HttpStatus.CREATED);
	}
	@Operation(description = "Used to get all Users from database")
	@ApiResponse(responseCode = "200 SUCCESS")
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUsers = userService.getAllUsers();
		return ResponseEntity.ok(allUsers);
	}
	
	@Operation(description = "Used to get specific User from database")
	@ApiResponse(responseCode = "200 SUCCESS")
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		User user=userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	
	@Operation(description = "Used to update specific User in to database")
	@ApiResponse(responseCode = "200 SUCCESS")
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id,@RequestBody User user){
		user.setId(id);
		User updatedUser = userService.updateUser(user);
		return ResponseEntity.ok(updatedUser);
	}
	
	@Operation(description = "Used to delete specific User in to database")
	@ApiResponse(responseCode = "200 SUCCESS")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("id") Integer userId){
		userService.deleteUser(userId);
		return ResponseEntity.ok("User deleted successfully");
		
	}
	

}
