package edu.realemj.Exercises11;

import javafx.geometry.Point2D;

public class TestShapes {
    public static void main(String [] args) {
        Circle c = new Circle();
        Circle c2 = new Circle(9.0, true,
                                new Point2D(-2, 19));
        Shape s = new Shape(false, new Point2D(5,7));

        System.out.println(s.getCenter());
        System.out.println(s.isFilled());

        System.out.println(c.getCenter());

        System.out.println(c2.getRadius());
        System.out.println(c2.getCenter());
        System.out.println(c2.isFilled());

        System.out.println(s);
        System.out.println(c2);  // c2.toString()


        Rectangle r = new Rectangle(7,9);
        Square sqr = new Square(5);
        System.out.println(r);
        System.out.println(sqr);

        sqr.setHeight(10);
        System.out.println(sqr);
    }
}
