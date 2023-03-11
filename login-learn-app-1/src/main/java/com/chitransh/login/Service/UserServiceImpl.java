package com.chitransh.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitransh.login.UserRepo.UserRepository;
import com.chitransh.login.entity.User;

@Service
public class UserServiceImpl implements UserService {

//	@Override
//	public boolean checkEmail(String email) {
//		// TODO Auto-generated method stub
//		return userRepo.existsByEmail(email);
//	}


	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}



}
