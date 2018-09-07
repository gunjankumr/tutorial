package com.studypoint.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypoint.spring.domain.Blog;
import com.studypoint.spring.repository.BlogsRepository;

@Service
public class BlogsService {
	
	@Autowired
	private BlogsRepository blogsRepository;
	
	public Blog storeBlog(Blog blog) {
		return blogsRepository.save(blog);
	}
	
	public Blog getByTitle(String title) {
		return blogsRepository.findByTitle(title);
	}

}
