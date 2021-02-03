package com.vbt.apispringboot.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vbt.apispringboot.domain.User;
import com.vbt.apispringboot.services.UserService;

// Rest Resource
@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	// Getting GET information
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {			
		List<User> list = service.findAll();	
		return ResponseEntity.ok().body(list);
	}
}
