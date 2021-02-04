package com.vbt.apispringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.apispringboot.domain.User;
import com.vbt.apispringboot.dto.UserDTO;
import com.vbt.apispringboot.repository.UserRepository;
import com.vbt.apispringboot.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	// Dependency Injection
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
