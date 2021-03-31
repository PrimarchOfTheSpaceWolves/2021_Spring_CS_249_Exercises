package edu.realemj.Exercises13;

public interface Juicable {
    String makeJuice();
    default void consume() {
        System.out.println("GLUG");
    }
}
