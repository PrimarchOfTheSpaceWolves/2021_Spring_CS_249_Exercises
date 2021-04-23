package edu.realemj.Exercises18.Iterator;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        final int WIDTH = 50;
        String p = String.format("%.2f", price);
        int nlen = name.length();
        int plen = p.length() + 1;
        int dotcnt = WIDTH - nlen - plen;
        String out = name;
        for(int i = 0; i < dotcnt; i++) {
            out += ".";
        }
        out += "$" + p;
        return out;
    }
}
