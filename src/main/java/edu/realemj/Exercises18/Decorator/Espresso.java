package edu.realemj.Exercises18.Decorator;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso");
    }

    public double cost() {
        return 1.99;
    }
}
