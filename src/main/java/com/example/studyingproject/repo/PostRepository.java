package com.example.studyingproject.repo;

import com.example.studyingproject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
