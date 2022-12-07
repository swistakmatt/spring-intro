package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameMessageService.class);
        ApplicationContext randContext = new AnnotationConfigApplicationContext(RandomTextMessageService.class);
        MessageService messageService = applicationContext.getBean(MessageService.class);
        MessageService messageService2 = randContext.getBean(MessageService.class);

        System.out.println("messageService: " + messageService.hashCode());
        System.out.println("messageService2: " + messageService2.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
    }
}
