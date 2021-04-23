package edu.realemj.Exercises18.Decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        String d = beverage.getDescription();
        d += ", " + "Whip";
        return d;
    }

    public double cost() {
        double c = beverage.cost();
        c += 0.10;
        return c;
    }
}

