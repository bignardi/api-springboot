package com.vbt.apispringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vbt.apispringboot.domain.Post;
import com.vbt.apispringboot.domain.User;
import com.vbt.apispringboot.repository.PostRepository;
import com.vbt.apispringboot.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	// Dependency Injection
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
