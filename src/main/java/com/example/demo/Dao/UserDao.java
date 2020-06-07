package com.example.demo.Dao;

import com.example.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User,Long> {

    User findByUsername(String username);

}
