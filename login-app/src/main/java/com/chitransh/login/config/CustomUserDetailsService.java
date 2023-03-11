package com.chitransh.login.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.chitransh.login.dao.UserRepository;
import com.chitransh.login.entities.User;

import jakarta.persistence.Id;

public class CustomUserDetailsService implements UserDetailsService {
	
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

}
