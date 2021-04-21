package edu.realemj.Exercises18.Strategy;

public class BearSimulator {
    public static void main(String [] args) {
        Bear g = new GrizzlyBear();
        Bear t = new TeddyBear();

        g.performMove();
        t.performMove();

        g.setMoveBehavior(new MoveWithTwoLegs());
        g.performMove();

        g.performRoar();
        t.performRoar();

        Bear b = new BathToyBear();
        b.performRoar();
    }
}
