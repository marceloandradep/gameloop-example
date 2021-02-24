package com.pereira.gameloop.ui;

import javax.swing.*;

public class GameWindow extends JFrame {

    private final GameScreen gameScreen;

    public GameWindow(int width, int height) {
        gameScreen = new GameScreen(width, height);

        this.getContentPane().add(gameScreen);
        this.setSize(width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        if (b) {
            gameScreen.start();
        }
    }
}
