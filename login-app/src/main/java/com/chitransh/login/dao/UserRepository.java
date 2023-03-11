package com.chitransh.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chitransh.login.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User,Integer> {

	org.springframework.security.core.userdetails.User findByUsername(String username);
	
}
