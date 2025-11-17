package com.security32.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security32.practise.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{
	
}
