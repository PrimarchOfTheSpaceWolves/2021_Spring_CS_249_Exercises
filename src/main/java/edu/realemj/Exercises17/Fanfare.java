package edu.realemj.Exercises17;

public class Fanfare<SOMETHING> {
    private SOMETHING thing;

    public Fanfare(SOMETHING s) {
        thing = s;
    }

    public SOMETHING getThing() {
        return thing;
    }

    public void setThing(SOMETHING s) {
        thing = s;
    }

    public void announce() {
        System.out.println("PRESENTING..." + thing);
    }
}
