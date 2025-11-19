package com.security32.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security32.practise.model.UserPrincipal;
import com.security32.practise.model.Users;
import com.security32.practise.repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	//adding one extra line
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repo.findByUsername(username);
		System.out.println(user);
		System.out.println(user);
		if (user == null) {
			System.out.println("User Not Found! " + user);
			throw new UsernameNotFoundException("userNotFount_ByException!");
		}
		return new UserPrincipal(user);
	}

}
