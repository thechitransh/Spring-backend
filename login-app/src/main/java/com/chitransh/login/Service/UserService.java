package com.chitransh.login.Service;

import java.util.List;

import com.chitransh.login.entities.User;

public interface UserService {
	public User saveUser(User user);
	public List<User>getallUsers();
}
