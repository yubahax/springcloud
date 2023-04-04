package com.example.service;


import com.example.entity.User;


import java.util.List;
import java.util.concurrent.Future;


public interface MyServcie {

    Future<List<User>> getAllAsync();

    List<User> getAll();
}
