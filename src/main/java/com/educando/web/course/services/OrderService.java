package com.educando.web.course.services;

import java.util.List;
import java.util.Optional;

import com.educando.web.course.entities.Order;
import com.educando.web.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findall() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
    
}
