package com.task2.SimpleBlogApp.ServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task2.SimpleBlogApp.Model.Post;
import com.task2.SimpleBlogApp.Persistance.IblogRepo;


@Service
public class IBlogServiceImpl implements IBlogService
{

	@Autowired
	private IblogRepo repo;
	
	
	@Override
	public Iterable<Post> getAllBlogs()
	{
		return repo.findAll();
		
	}


	@Override
	public Post save(Post blog)
	{
		return repo.save(blog);
		
	}


	@Override
	public Optional<Post> findById(Integer id)
	{
		return repo.findById(id);
	}


	@Override
	public void deleteBlogById(Integer id)
	{
		repo.deleteById(id);
		
	}


	@Override
	public List<Post> findAllByUsername(String username)
	{
		return repo.findByUsername(username);
	}

}
