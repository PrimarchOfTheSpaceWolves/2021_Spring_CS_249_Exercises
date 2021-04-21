package edu.realemj.Exercises18.Strategy;

public class TeddyBear extends Bear {
    public TeddyBear() {
        moveBehavior = new NoMove();
        roarBehavior = new Squeak();
    }
}
