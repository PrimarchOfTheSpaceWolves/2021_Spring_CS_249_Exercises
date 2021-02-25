package edu.realemj.Exercises09;

public class Circle {
    private double radius = 1.0;
    //private double [] pos = { 0, 0 };
    private double x = 0;
    private double y = 0;

    public Circle() {}

    public Circle(double r) {
        //radius = r;
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
