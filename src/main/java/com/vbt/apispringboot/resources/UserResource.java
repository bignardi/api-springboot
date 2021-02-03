package com.vbt.apispringboot.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vbt.apispringboot.domain.User;

// Rest Resource
@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	// Getting GET information
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {	
		User vinicius = new User("1", "Vinicius", "vinicius@outlook.com");
		User bignardi = new User("2", "Bignardi", "bignardi@outlook.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(vinicius, bignardi));
		
		return ResponseEntity.ok().body(list);
	}
}
