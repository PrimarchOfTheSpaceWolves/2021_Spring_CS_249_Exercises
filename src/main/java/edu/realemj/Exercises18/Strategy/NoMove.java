package edu.realemj.Exercises18.Strategy;

public class NoMove implements Moveable {
    public void move() {
        System.out.println("I can't move!");
    }
}
