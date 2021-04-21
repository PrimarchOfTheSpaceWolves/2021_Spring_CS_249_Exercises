package edu.realemj.Exercises18.Decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast");
    }

    public double cost() {
        return 0.99;
    }
}
