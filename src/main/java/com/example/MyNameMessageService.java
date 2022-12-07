package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class MyNameMessageService implements MessageService {
    @Bean
    public String getMessage() {
        return "Mateusz Swistak";
    }
}
