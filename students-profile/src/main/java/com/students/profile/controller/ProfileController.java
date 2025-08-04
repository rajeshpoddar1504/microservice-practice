package com.students.profile.controller;

import com.students.profile.beans.User;
import com.students.profile.beans.UserDetails;
import com.students.profile.services.ResultFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class ProfileController {

    @Autowired
    ResultFetcher resultFetcher;

    List<User> list=new ArrayList<>();

    @PostMapping
    public  User addUser(@RequestBody User user){
        list.add(user);
        return user ;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int n){

        list.add(new User("demo-user","demouser","demo@gmail.com"));

        return list.get(n);
    }
    @GetMapping("/details/{id}")
    public UserDetails getUserDetailsWithResult(@PathVariable("id") int n){

        return new UserDetails(new User("user1","userLname","user@gmail.com"),resultFetcher.getResult());
    }

}
