package edu.realemj.Exercises17;

import java.util.ArrayList;
import edu.realemj.Exercises13.*;

public class AreaManager<E extends Shape> {
    private ArrayList<E> allShapes = new ArrayList<>();

    public void add(E e) {
        allShapes.add(e);
    }

    public double computeAllAreas() {
        double area = 0;
        for(E shape: allShapes) {
            area += shape.getArea();
        }
        return area;
    }
}
