package com.app.learningspring02.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GamingConsole game;

    GameRunner( @Qualifier("SuperContraQualifier") GamingConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game : " + game);
        game.up();
        game.down();
        game.up();
        game.left();
    }

}
