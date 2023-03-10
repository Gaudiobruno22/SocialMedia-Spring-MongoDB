package com.social.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.application.model.Post;
import com.social.application.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository repository;
	
	public List<Post> findAll(){
		return repository.findAll();
	}
	
}
