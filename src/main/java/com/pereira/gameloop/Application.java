package com.pereira.gameloop;

import com.pereira.gameloop.ui.GameWindow;

public class Application {

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow(800, 600);
        gameWindow.setVisible(true);
    }

}
