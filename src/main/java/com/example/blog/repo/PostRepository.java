package com.example.blog.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
