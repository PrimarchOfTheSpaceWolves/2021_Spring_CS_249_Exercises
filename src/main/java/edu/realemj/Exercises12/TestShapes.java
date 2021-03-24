package edu.realemj.Exercises12;

import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShapes {
    public static void main(String [] args) {

        try {
            Circle c1 = new Circle(7);
            System.out.println(c1);
            Circle c2 = new Circle(-3);
            System.out.println(c2);
            Circle c3 = new Circle(4);
            System.out.println(c3);
        }
        catch(InvalidRadiusException e) {
            System.err.println("Circle creation failed");
            System.err.println(e);
            double r = e.getRadius();
            System.err.println("Example valid radius: "
            + (-r));
        }
        catch(Exception e) {
            System.err.println("Some other error");
            System.err.println(e);
        }

        System.out.println("Program done!");
    }
}
