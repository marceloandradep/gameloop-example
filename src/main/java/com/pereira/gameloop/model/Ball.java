package com.pereira.gameloop.model;

public class Ball {

    private final int size;
    private final int worldWidth, worldHeight;
    private float x, y;
    private float vx, vy;

    public Ball(int size, int worldWidth, int worldHeight) {
        this.size = size;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
        this.x = (float)worldWidth / 2;
        this.y = (float)worldHeight / 2;
        this.vx = 0.1f;
        this.vy = 0.1f;
    }

    public void update(int delta) {
        x += vx * delta;
        y += vy * delta;

        if (x < 0 || x > worldWidth) {
            vx *= -1;
        }

        if (y < 0 || y > worldHeight) {
            vy *= -1;
        }
    }

    public int getSize() {
        return size;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
