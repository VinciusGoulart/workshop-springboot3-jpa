package com.webproject.course.servicies;

import com.webproject.course.entities.Payment;
import com.webproject.course.entities.User;
import com.webproject.course.repositories.PaymentRepository;
import com.webproject.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository  paymentRepository;

    public List<Payment> findAll(){
        return paymentRepository.findAll();
    }

    public Payment findById(Integer id){
        Optional<Payment> obj = paymentRepository.findById(id);
        return obj.get();
    }
}
