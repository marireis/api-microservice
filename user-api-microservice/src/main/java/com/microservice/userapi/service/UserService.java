package com.microservice.userapi.service;

import com.microservice.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
