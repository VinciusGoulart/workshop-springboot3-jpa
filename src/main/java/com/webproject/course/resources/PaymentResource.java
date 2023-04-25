package com.webproject.course.resources;

import com.webproject.course.entities.Category;
import com.webproject.course.entities.Payment;
import com.webproject.course.servicies.CategoryService;
import com.webproject.course.servicies.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> list = paymentService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findById(@PathVariable Integer id) {
        Payment obj = paymentService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
