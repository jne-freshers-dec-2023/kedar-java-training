package com.app.learningspring02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class Dependency1{

}


@Component
class Dependency2{

}


@Component
class BussinessLogic{

    Dependency1 dependency1;
    Dependency2 dependency2;

    public BussinessLogic(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return  " Using" + " Dependency 1 : " + dependency1 + " and " + " Dependency 2 : " + dependency2;
    }
}



@Configuration
@ComponentScan
public class DependencyInjectionApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);


            System.out.println(context.getBean(BussinessLogic.class));

        }
    }

}
