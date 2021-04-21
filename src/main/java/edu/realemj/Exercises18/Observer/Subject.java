package edu.realemj.Exercises18.Observer;

public interface Subject {
    void registerObserver(Observer x);
    void removeObserver(Observer x);
    void notifyObservers();
}
