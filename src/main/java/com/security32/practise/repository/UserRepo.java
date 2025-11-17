package com.security32.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security32.practise.model.Users;
@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
}
