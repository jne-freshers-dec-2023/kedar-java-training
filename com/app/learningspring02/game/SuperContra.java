package com.app.learningspring02.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Moving Up");
    }

    @Override
    public void down() {
        System.out.println("Moving down");
    }

    @Override
    public void left() {
        System.out.println("Moving left");
    }

    @Override
    public void right() {
        System.out.println("Moving right");
    }
}
