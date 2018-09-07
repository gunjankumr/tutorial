package com.studypoint.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studypoint.spring.domain.Blog;

@Repository
public interface BlogsRepository extends MongoRepository<Blog, String> {

    public Blog findByTitle(String title);
}
