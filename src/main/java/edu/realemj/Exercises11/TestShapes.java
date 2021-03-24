package edu.realemj.Exercises11;

import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.Scanner;

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

        Shape.makeShapeSpeech();
        Circle.makeShapeSpeech();

        printShape(s);
        printShape(c2);

        Shape s2 = new Circle(6.5,
                            true,
                                new Point2D(3,1));

        ArrayList<Shape> allShapes = new ArrayList<>();
        allShapes.add(new Shape(false, new Point2D(4,5)));
        allShapes.add(new Circle(6.4, true,
                        new Point2D(2,3)));
        allShapes.add(new Circle(8.1, true,
                        new Point2D(2,3)));
        allShapes.add(new Rectangle(200, 350));

        System.out.println(allShapes);

        int index = allShapes.indexOf(
                new Circle(8.1, true, new Point2D(2,3)));

        System.out.println("Location: " + index);

        int rindex = allShapes.indexOf(
                new Rectangle(400, 350));

        System.out.println("Rectangle location: " + rindex);

        for(int i = 0; i < allShapes.size(); i++) {
            System.out.println(i + ": " + allShapes.get(i));
        }

        for(Shape e: allShapes) {
            if(e instanceof Circle) {
                System.out.println("CIRCLE!");
            }
            else if(e instanceof Rectangle) {
                System.out.println("RECTANGLE!");
            }
            else {
                System.out.println("SHAPE!");
            }
        }

        ArrayList<Circle> myCircles = new ArrayList<>();
        makeCircleList(myCircles, 5);
        System.out.println(myCircles);
        makeCircleList(myCircles, 3);
        System.out.println(myCircles);

        SystemInputSingleton si = SystemInputSingleton.getInstance();
        Scanner input = si.getScanner();

        // PRIVATE: SystemInputSingleton bad = new SystemInputSingleton();
    }

    public static void makeCircleList(ArrayList<Circle> allCircles,
                                      int maxRadius) {
        allCircles.clear();
        for(int r = 1; r <= maxRadius; r++) {
            allCircles.add(new Circle(r));
        }
    }

    public static void printShape(Shape s) {
        System.out.println("AND LO! A SHAPE...");
        System.out.println(s.toString());
    }
}
