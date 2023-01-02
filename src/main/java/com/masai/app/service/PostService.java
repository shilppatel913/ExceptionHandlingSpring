package com.masai.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.entity.Post;

public interface PostService {
	public List<Post> createPost(Post post);
}
