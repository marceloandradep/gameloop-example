package com.pereira.gameloop.ui;

import com.pereira.gameloop.core.GameLoop;
import com.pereira.gameloop.core.GameLoopListener;
import com.pereira.gameloop.model.Ball;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel implements GameLoopListener {

    private final GameLoop gameLoop;
    private final Ball ball;

    public GameScreen(int width, int height) {
        gameLoop = new GameLoop(60, this);
        ball = new Ball(50, width, height);

        this.setBackground(Color.BLACK);
    }

    public void start() {
        gameLoop.start();
    }

    @Override
    public void update(int delta) {
        ball.update(delta);
        SwingUtilities.invokeLater(this::repaint);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int radius = ball.getSize() / 2;
        int x = (int) (ball.getX() - radius);
        int y = (int) (ball.getY() - radius);

        g.setColor(Color.WHITE);
        g.drawOval(x, y, ball.getSize(), ball.getSize());
    }
}
