package com.webproject.course.servicies;

import com.webproject.course.entities.Category;
import com.webproject.course.entities.Order;
import com.webproject.course.repositories.CategoryRepository;
import com.webproject.course.repositories.OrderRepository;
import com.webproject.course.servicies.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Integer id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
