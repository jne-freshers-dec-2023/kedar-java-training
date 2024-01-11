package com.app.calculator;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class BusinessCalculatorService{


    private DataService dataService;

    public BusinessCalculatorService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }
}
@Configuration
@ComponentScan
public class CalculatorCalling {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CalculatorCalling.class)){

            System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
        }

    }

}
