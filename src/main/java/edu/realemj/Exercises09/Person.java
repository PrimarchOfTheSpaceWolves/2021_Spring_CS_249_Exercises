package edu.realemj.Exercises09;

public class Person {
    private String name = "";
    private boolean alive = true;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        if(alive) {
            System.out.println(name + " has passed on.");
        }
        alive = false;
    }
}
