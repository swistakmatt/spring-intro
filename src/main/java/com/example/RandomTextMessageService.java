package com.example;


import java.util.Random;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class RandomTextMessageService implements MessageService {

        private final String[] messages = {
                "Hello World 0",
                "Hello World 1",
                "Hello World 2",
                "Hello World 3",
                "Hello World 4",
                "Hello World 5",
                "Hello World 6",
                "Hello World 7",
                "Hello World 8",
                "Hello World 9"
        };


        @Bean
        public String getMessage() {
            Random random = new Random();
            int index = random.nextInt(messages.length);
            return messages[index];
        }
}
