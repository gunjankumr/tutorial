package com.studypoint.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypoint.spring.domain.Blog;
import com.studypoint.spring.services.BlogsService;

@RestController
public class BlogsController {
	
	@Autowired
	private BlogsService blogsService;

	@PostMapping("/blog")
	public String saveCustomer(@RequestBody Blog blog) {
		if(null != blogsService.storeBlog(blog)) {
			return "SUCCESS";
		}
		
		return "FAILED";
	}
	
	@GetMapping("/blog/{title}")
	public Blog getbyFirstName(@PathVariable String title) {
		return blogsService.getByTitle(title);
	}
}
