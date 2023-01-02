package com.masai.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.entity.Post;
import com.masai.app.exception.InvalidIsVisibleException;
import com.masai.app.service.PostServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@PostMapping("/")
	public ResponseEntity<?> createPost(@Valid @RequestBody Post post) throws MethodArgumentNotValidException{
		/**if(post.isVisible()==false)
			throw new IllegalArgumentException("Invalid data");**/
		System.out.println(post.isVisible());
		if(post.isVisible()==false) {
			throw new InvalidIsVisibleException("IsVisible attribute should always be true");
		}
		
		List<Post> posts=this.postServiceImpl.createPost(post);
		return new ResponseEntity<List<Post>>(posts,HttpStatus.OK);
	}
	
	
	
	/**@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> handleException(IllegalArgumentException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	} **/
}
