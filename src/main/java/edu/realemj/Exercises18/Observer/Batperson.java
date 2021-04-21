package edu.realemj.Exercises18.Observer;

public class Batperson implements Observer {
    private String name;

    public Batperson(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        if(s instanceof Batsignal) {
            Batsignal b = (Batsignal)s;
            System.out.println("This is " + name
                + ", responding to " + b.getActiveCrime());
        }
        else if(s instanceof HallOfJustice) {
            System.out.println(name + ": " + "UUUUUUUUGGGH");
        }
    }
}
