package com.vbt.apispringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vbt.apispringboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
