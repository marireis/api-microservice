package com.microservice.userapi.service.impl;

import com.microservice.userapi.domain.User;
import com.microservice.userapi.repository.UserRepository;
import com.microservice.userapi.service.UserService;
import com.microservice.userapi.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
    }
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
