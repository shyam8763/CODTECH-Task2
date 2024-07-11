package com.task2.SimpleBlogApp.Persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task2.SimpleBlogApp.Model.Post;
import java.util.List;


@Repository
public interface IblogRepo extends CrudRepository<Post, Integer>
{
      public List<Post> findByUsername(String username); 
}
