package com.company.springboot.config;

import com.company.springboot.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public User userBean(){
        User user = new User();
        user.setName("Parvin");
        return user;
    }
}
