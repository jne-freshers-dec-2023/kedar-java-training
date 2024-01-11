package com.in28minutes.learnspringframework01;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { }

record Address(String street, String city) { };


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Kedar";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        return new Person("John Wick",35);
    }

    @Bean
    public Address address(){
        return new Address("Baker Street","London");
    }
}
