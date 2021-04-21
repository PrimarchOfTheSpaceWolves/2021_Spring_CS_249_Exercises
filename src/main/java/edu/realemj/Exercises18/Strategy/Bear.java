package edu.realemj.Exercises18.Strategy;

public abstract class Bear {
    protected Moveable moveBehavior;
    protected RoarBehavior roarBehavior;

    public void performMove() {
        moveBehavior.move();
    }

    public void setMoveBehavior(Moveable m) {
        moveBehavior = m;
    }

    public void performRoar() {
        roarBehavior.roar();
    }
}
