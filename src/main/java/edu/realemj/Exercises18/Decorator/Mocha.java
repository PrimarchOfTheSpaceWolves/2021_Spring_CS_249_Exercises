package edu.realemj.Exercises18.Decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        String d = beverage.getDescription();
        d += ", " + "Mocha";
        return d;
    }

    public double cost() {
        double c = beverage.cost();
        c += 0.20;
        return c;
    }
}
