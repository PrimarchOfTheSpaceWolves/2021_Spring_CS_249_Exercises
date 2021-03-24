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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Shape) {
            Shape other = (Shape)obj;
            return (this.filled == other.filled
                    && this.center.equals(other.center));
        }
        else {
            return false;
        }
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
        /*
        s += "Filled? " + filled + "\n";
        s += "Center: " + center.getX();
        s += ", " + center.getY() + "\n";
         */
        s += "[";
        if(filled) {
            s += "filled, ";
        }
        s += "(" + center.getX() + ",";
        s += center.getY() + ")";
        s += "]";
        return s;
    }

    public static void makeShapeSpeech() {
        System.out.println("BEHOLD!");
    }
}
