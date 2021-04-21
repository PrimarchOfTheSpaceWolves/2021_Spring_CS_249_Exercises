package edu.realemj.Exercises18.Observer;

public class GothamCity {
    public static void main(String [] args) {
        Batsignal signal = new Batsignal();

        Batperson bruce = new Batperson("Batman");
        Batperson tim = new Batperson("Robin");
        Batperson barbara = new Batperson("Batgirl");
        Batperson grayson = new Batperson("Nightwing");

        signal.registerObserver(bruce);
        signal.registerObserver(tim);
        signal.registerObserver(barbara);
        signal.registerObserver(grayson);

        signal.setActiveCrime("robbery");

        signal.removeObserver(grayson);

        signal.setActiveCrime("kidnapping");

        Superperson jon = new Superperson("Jon Kent");
        signal.registerObserver(jon);
        signal.setActiveCrime("explosion");

        Superperson clark = new Superperson("Superman");

        HallOfJustice hall = new HallOfJustice();
        hall.registerObserver(bruce);
        hall.registerObserver(clark);
        hall.callMeeting();

    }
}
