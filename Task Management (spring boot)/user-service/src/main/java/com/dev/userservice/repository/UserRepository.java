package com.dev.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.userservice.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
