package edu.realemj.Exercises09;

public class Circle {
    private double radius = 1.0;
    //private double [] pos = { 0, 0 };
    private double x = 0;
    private double y = 0;

    public Circle() {
        this(1, 0, 0);
    }

    public Circle(double r) {
        this(r, 0, 0);
        //radius = r;
        //setRadius(r);
    }

    // Circle c = new Circle(5, 6);
    public Circle(double x, double y) {
        this(1.0, x, y);
        //this.x = x;
        //this.y = y;
    }

    public Circle(double r, double x, double y) {
        this.x = x;
        this.y = y;
        setRadius(r);
    }

    public double getX() {
        //return pos[0];
        return x;
    }

    public double getY() {
        //return pos[1];
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(r >= 0) {
            radius = r;
        }
    }
}
