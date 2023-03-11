package com.chitransh.login.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chitransh.login.Service.UserService;
import com.chitransh.login.entities.User;
//import com.chitransh.login.entities.login;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000/")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/regester")
	public String regester(@RequestBody User user) {
		userService.saveUser(user);
		return "new user is added";
	}
	
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	

//	@PostMapping("/login")
//	public String loginUser(@RequestBody login login) {
//		return "login";
//	}
	
	@GetMapping("/getAll")
	public List<User> getallUsers() {
		return userService.getallUsers();
	}
	
}
