package com.webproject.course.repositories;

import com.webproject.course.entities.Payment;
import com.webproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
