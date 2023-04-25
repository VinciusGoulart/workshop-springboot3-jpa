package com.webproject.course.repositories;

import com.webproject.course.entities.OrderItem;
import com.webproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
