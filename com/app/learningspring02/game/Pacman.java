package com.app.learningspring02.game;


import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Moving Up");
    }

    @Override
    public void down() {
        System.out.println("Moving Down");
    }

    @Override
    public void left() {
        System.out.println("Moving Right");
    }

    @Override
    public void right() {
        System.out.println("Moving left");
    }
}
