package com.chitransh.login.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chitransh.login.dao.UserRepository;
import com.chitransh.login.entities.User;

@Service
public class StudentServiceImpl implements UserService {

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}


	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	
	
}
