package edu.realemj.Exercises18;

public abstract class Bear {
    protected Moveable moveBehavior;

    public void performMove() {
        moveBehavior.move();
    }
}
