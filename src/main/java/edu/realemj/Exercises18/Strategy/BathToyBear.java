package edu.realemj.Exercises18.Strategy;

public class BathToyBear extends Bear{
    public BathToyBear() {
        moveBehavior = new NoMove();
        roarBehavior = new Squeak();
    }
}
