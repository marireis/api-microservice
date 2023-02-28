package com.microservice.userapi.service.impl;

import com.microservice.userapi.domain.User;
import com.microservice.userapi.repository.UserRepository;
import com.microservice.userapi.service.UserService;
import com.microservice.userapi.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;
    private final Environment env;
    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
