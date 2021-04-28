package edu.realemj.Exercises18.Iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {
    public final int MAX_ITEMS = 6;
    private MenuItem [] data = new MenuItem[MAX_ITEMS];
    private int cnt = 0;

    public LunchMenu() {
        data[0] = new MenuItem("Pizza", 5.99);
        data[1] = new MenuItem("Sandvich", 2.99);
        cnt = 2;
    }

    public MenuItem[] getMenuItems() {
        return data;
    }

    public int getCnt() {
        return cnt;
    }

    public Iterator<MenuItem> createIterator() {
        return new LunchIterator(data);
    }
}
