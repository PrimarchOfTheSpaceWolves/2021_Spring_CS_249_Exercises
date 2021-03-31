package edu.realemj.Exercises13;

public interface Edible {
    String howToEat();
    default void consume() {
        System.out.println("CHOMP");
    }
}
