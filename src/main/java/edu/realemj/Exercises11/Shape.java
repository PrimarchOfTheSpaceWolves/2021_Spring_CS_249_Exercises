package edu.realemj.Exercises11;

import javafx.geometry.Point2D;

public class Shape {
    // Usually just make all protected or all private
    protected boolean filled = true;
    private Point2D center = new Point2D(0,0);

    public Shape() {}

    public Shape(boolean filled, Point2D center) {
        this.filled = filled;
        this.center = center;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Filled? " + filled + "\n";
        s += "Center: " + center.getX();
        s += ", " + center.getY() + "\n";
        return s;
    }
}
