package edu.realemj.Exercises17;

import edu.realemj.Exercises13.*;

public class AreaProgram {
    public static void main(String [] args) {
        try {
            AreaManager<Circle> circleAreas = new AreaManager<>();

            circleAreas.add(new Circle(6.7));
            circleAreas.add(new Circle(1.2));
            circleAreas.add(new Circle(8.9));

            double totalArea = circleAreas.computeAllAreas();
            System.out.println("TOTAL AREA: " + totalArea);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
