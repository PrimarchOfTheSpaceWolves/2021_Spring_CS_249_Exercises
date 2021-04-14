package edu.realemj.Exercises17;

import java.util.ArrayList;

public class GenericQueue<E> {
    private ArrayList<E> data = new ArrayList<>();

    public int size() {
        return data.size();
    }

    public E peek() {
        return data.get(0);
    }

    public E dequeue() {
        E top = data.remove(0);
        return top;
    }

    public void enqueue(E item) {
        data.add(item);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public String toString() {
        return data.toString();
    }
}
