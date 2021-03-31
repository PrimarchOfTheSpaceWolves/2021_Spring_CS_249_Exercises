package edu.realemj.Exercises13;

public class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius: " + radius);
        this.radius = radius;
    }

    public InvalidRadiusException(double radius, Exception e) {
        super("Invalid radius: " + radius, e);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
