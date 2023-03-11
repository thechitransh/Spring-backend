package com.chitransh.login.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chitransh.login.Service.UserService;
import com.chitransh.login.entity.User;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/regester")
	public String register() {
		return "regester";
	}
	
	@PostMapping("/createUser")
	public String regester(@RequestBody User user) {
		userService.saveUser(user);
		return "user added";
	}
}
	

