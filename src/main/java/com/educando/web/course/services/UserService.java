package com.educando.web.course.services;

import java.util.List;
import java.util.Optional;

import com.educando.web.course.entities.User;
import com.educando.web.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findall() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
    
}
