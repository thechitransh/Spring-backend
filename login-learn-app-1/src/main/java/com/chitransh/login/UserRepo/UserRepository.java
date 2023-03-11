package com.chitransh.login.UserRepo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.chitransh.login.entity.User;

public interface UserRepository extends JpaRepository< User, Integer> {
	
}
