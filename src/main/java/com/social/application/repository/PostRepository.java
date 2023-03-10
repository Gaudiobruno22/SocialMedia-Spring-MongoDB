package com.social.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.social.application.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
