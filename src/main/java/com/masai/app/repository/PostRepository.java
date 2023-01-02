package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {

}
