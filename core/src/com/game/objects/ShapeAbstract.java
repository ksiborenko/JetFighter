package com.game.objects;

public abstract class ShapeAbstract {

    private int xPosition;
    private int yPosition;
    private int width;
    private int height;

    protected ShapeAbstract(int xPosition, int yPosition, int width, int height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public void move(int xSpeed, int ySpeed) {
        this.xPosition += xSpeed;
        this.yPosition += ySpeed;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
