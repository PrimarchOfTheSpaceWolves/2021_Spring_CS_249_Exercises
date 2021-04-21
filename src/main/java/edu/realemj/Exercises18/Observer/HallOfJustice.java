package edu.realemj.Exercises18.Observer;

import java.util.ArrayList;

public class HallOfJustice implements Subject {
    private ArrayList<Observer> allObservers = new ArrayList<>();

    public void registerObserver(Observer x) {
        allObservers.add(x);
    }

    public void removeObserver(Observer x) {
        allObservers.remove(x);
    }

    public void notifyObservers() {
        for(Observer obs: allObservers) {
            obs.update(this);
        }
    }

    public void callMeeting() {
        notifyObservers();
    }

}
