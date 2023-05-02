package com.webproject.course.servicies;

import com.webproject.course.entities.Order;
import com.webproject.course.repositories.OrderRepository;
import com.webproject.course.resources.OrderResource;
import com.webproject.course.servicies.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Integer id) {
            Optional<Order> obj = orderRepository.findById(id);
            return obj.orElseThrow(() -> new ResourceNotFoundException(id));

    }
}
