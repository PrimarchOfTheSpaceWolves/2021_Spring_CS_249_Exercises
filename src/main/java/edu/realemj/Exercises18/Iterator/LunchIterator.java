package edu.realemj.Exercises18.Iterator;

import java.util.Iterator;

public class LunchIterator implements Iterator<MenuItem> {
    private MenuItem [] items;
    private int pos;

    public LunchIterator(MenuItem [] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if(pos >= items.length || items[pos] == null) {
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem m = items[pos];
        pos++;
        return m;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
