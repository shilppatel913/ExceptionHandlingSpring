package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.entity.Post;
import com.masai.app.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Post> createPost(Post post) {
		Post p=this.postRepository.save(post);
		return this.postRepository.findAll(); 
	}

}
