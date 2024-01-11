package com.app.learningspring02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.app.learningspring02.game")
public class AppGamingSpringBean {

    public static void main(String[] args) {

        try(var context = new
                AnnotationConfigApplicationContext
                (AppGamingSpringBean.class)){

            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
