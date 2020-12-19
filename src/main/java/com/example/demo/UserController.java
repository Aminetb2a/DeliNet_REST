package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	public UserRepository userRepository;

	@GetMapping("/all")
	public List<User> getAllusers(){
		return userRepository.findAll();
 }

	 @PostMapping("/createUser")
	 public String createUser(@RequestBody User user) {
		 User insertedUser = userRepository.insert(user);
	     return "User created" + insertedUser.getFullName();
 }
}
