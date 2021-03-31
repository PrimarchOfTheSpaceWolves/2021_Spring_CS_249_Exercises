package edu.realemj.Exercises13;

public class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "fried chicken";
    }

    public void consume() {
        System.out.println("Munch munch");
    }
}
