package edu.realemj.Exercises11;

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

    public Circle(double radius) {
        // super(); // auto-inserted by Java
        this.radius = radius;
    }

    public Circle(double radius,
                  boolean filled,
                  Point2D center) {
        super(filled, center);
        //this(filled, center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
}
