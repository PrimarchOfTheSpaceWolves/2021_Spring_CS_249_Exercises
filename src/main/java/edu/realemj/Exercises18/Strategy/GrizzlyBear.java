package edu.realemj.Exercises18.Strategy;

public class GrizzlyBear extends Bear {
    public GrizzlyBear() {
        moveBehavior = new MoveWithFourLegs();
        roarBehavior = new LoudRoar();
    }
}
