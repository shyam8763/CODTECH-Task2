package com.task2.SimpleBlogApp.Persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task2.SimpleBlogApp.Model.User;


@Repository
public interface IUserRepo extends CrudRepository<User, Integer>
{
    public User findByFirstnameAndSetPassword(String name1,String name2);
}
