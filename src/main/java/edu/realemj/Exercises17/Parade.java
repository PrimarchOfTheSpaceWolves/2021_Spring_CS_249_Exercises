package edu.realemj.Exercises17;

import edu.realemj.Exercises13.Circle;

public class Parade {
    public static void main(String [] args) {
        try {
            Fanfare<String> s = new Fanfare<>("Bob");
            Fanfare<Circle> c = new Fanfare<>(new Circle(5.8));

            String name = s.getThing();
            Circle circle = c.getThing();

            c.setThing(new Circle(8.9));

            s.announce();
            c.announce();

            NameFanfare nf = new NameFanfare("Joe");
            nf.setThing("Joseph");

            ExcitedFanfare<String> ef = new ExcitedFanfare<>("Susan");
            ef.announce();

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
