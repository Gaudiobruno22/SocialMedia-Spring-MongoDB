package com.social.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.social.application.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
