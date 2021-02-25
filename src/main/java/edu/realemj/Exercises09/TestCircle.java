package edu.realemj.Exercises09;

public class TestCircle {
    public static void doubleRadius(Circle c) {
        double r = c.getRadius();
        r *= 2.0;
        c.setRadius(r);
    }

    public static void makeNewCircle(Circle c) {
        c = new Circle(7.0);
    }

    public static void main(String [] args) {
        Circle c1 = new Circle();
        //System.out.println(c1.radius);
        System.out.println(c1.getRadius());
        c1.setRadius(5.0);
        System.out.println(c1.getRadius());
        c1.setRadius(-8.0);
        System.out.println(c1.getRadius());

        doubleRadius(c1);
        System.out.println(c1.getRadius()); 

        makeNewCircle(c1);
        System.out.println(c1.getRadius());

        System.out.println("Position: " + c1.getX()
                            + "," + c1.getY());

    }
}
