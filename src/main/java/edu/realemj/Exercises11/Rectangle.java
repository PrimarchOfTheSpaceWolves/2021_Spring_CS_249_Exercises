package edu.realemj.Exercises11;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double height = 1.0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String s = width + " x " + height;
        return s;
    }
}
