package edu.realemj.Exercises18.Observer;

import java.util.ArrayList;

public class Batsignal implements Subject {
    private ArrayList<Observer> allObservers = new ArrayList<>();
    private String activeCrime = "";

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

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }

    public String getActiveCrime() {
        return activeCrime;
    }
}
