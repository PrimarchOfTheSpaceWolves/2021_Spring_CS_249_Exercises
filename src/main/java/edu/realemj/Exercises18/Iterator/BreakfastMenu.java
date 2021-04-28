package edu.realemj.Exercises18.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu {
    private ArrayList<MenuItem> data = new ArrayList<>();

    public BreakfastMenu() {
        data.add(new MenuItem("Bacon and Eggs", 3.99));
        data.add(new MenuItem("Pancakes", 4.99));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return data;
    }

    public Iterator<MenuItem> createIterator() {
        return data.iterator();
    }
}
