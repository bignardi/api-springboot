package com.vbt.apispringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vbt.apispringboot.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	// With this statement, Spring Data makes the query (Query Method's)
	List<Post> findByTitleContainingIgnoreCase(String text);
}
