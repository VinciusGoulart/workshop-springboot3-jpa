package com.webproject.course.config;

import com.webproject.course.entities.User;
import com.webproject.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    public UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Venus","venus@email.com","88888888","987654321");
        User u2 = new User(null,"Earth","earth@email.com","77777777","789456123");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
