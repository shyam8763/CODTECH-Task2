package com.task2.SimpleBlogApp.ServiceLayer;

import java.util.List;
import java.util.Optional;

import com.task2.SimpleBlogApp.Model.Post;

public interface IBlogService
{
     public Iterable<Post> getAllBlogs();
     
     public Post save(Post blog);
     
     public Optional<Post> findById(Integer id); 
     
     public void deleteBlogById(Integer id);
     
     
     public List<Post> findAllByUsername(String username);
}
