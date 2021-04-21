package edu.realemj.Exercises18.Observer;

public class Superperson implements Observer {
    private String name;

    public Superperson(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        if(s instanceof Batsignal) {
            Batsignal b = (Batsignal)s;
            System.out.println("This is " + name
                    + ", do you need help with "
                    + b.getActiveCrime() + "?");
        }
        else if(s instanceof HallOfJustice) {
            System.out.println(name + ": " + "Oh boy!");
        }
    }
}
