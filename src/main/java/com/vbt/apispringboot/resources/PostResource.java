package com.vbt.apispringboot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vbt.apispringboot.domain.Post;
import com.vbt.apispringboot.services.PostService;

// Rest Resource
@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	// Getting GET information
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id) { // Id related to url Id	
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
