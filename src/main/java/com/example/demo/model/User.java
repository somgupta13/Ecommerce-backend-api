package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
@Getter
@Setter
@Repository
@Document(collection = "user")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;


    private String password;
public User(){this.id=1;}
User(String username,String password){
    this.id=1;
    this.username=username;this.password=password;
}


}