package com.webproject.course.resources;

import com.webproject.course.entities.Order;

import com.webproject.course.servicies.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderRepository;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = orderRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Order> findById(@PathVariable Integer id){
        Order obj = orderRepository.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
