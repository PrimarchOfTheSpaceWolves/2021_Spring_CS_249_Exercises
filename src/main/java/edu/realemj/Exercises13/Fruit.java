package edu.realemj.Exercises13;

public abstract class Fruit extends Plant
        implements Edible,Juicable {

    public String makeJuice() {
        return "squeeze fruit";
    }

    public void consume() {
        System.out.println("Crunch");
    }

}
