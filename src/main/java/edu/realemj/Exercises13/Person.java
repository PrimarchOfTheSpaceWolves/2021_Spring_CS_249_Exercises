package edu.realemj.Exercises13;

public class Person implements Comparable<Person> {
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

    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }

    public String toString() {
        return name;
    }
}
