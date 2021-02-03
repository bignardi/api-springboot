package com.vbt.apispringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.apispringboot.domain.User;
import com.vbt.apispringboot.repository.UserRepository;

@Service
public class UserService {

	// Dependency Injection
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
