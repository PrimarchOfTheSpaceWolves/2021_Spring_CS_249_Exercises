package edu.realemj.Exercises13;

import javafx.geometry.Point2D;

public class Circle extends Shape {

    private double radius = 1.0;

    public Circle() {}

    public Circle(boolean filled, Point2D center) {
        super(filled, center);
        // OR
        //this.filled = filled;
        //setCenter(center);
    }

    public Circle(double radius)
        throws InvalidRadiusException {
        // super(); // auto-inserted by Java
        setRadius(radius);
    }

    public Circle(double radius,
                  boolean filled,
                  Point2D center)
        throws InvalidRadiusException {
        super(filled, center);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
            throws InvalidRadiusException {
        if(radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new InvalidRadiusException(radius);
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = s.substring(0, s.length()-1);
        s += ", r = " + radius + "]";
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle) {
            if(!super.equals(obj)) {
                return false;
            }

            final double EPS = 1e-15;
            return Math.abs(((Circle)obj).radius - radius) < EPS;
        }
        else {
            return false;
        }
    }

    public static void makeShapeSpeech() {
        System.out.println("VERILY!");
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
