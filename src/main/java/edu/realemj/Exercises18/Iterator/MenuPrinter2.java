package edu.realemj.Exercises18.Iterator;

import java.util.Iterator;

public class MenuPrinter2 {
    private Menu breakfast = new BreakfastMenu();
    private Menu lunch = new LunchMenu();

    public void printMenu(Iterator<MenuItem> menu) {
        while(menu.hasNext()) {
            System.out.println(menu.next());
        }
    }

    public void printAllMenus() {
        System.out.println("BREAKFAST:");
        printMenu(breakfast.createIterator());
        System.out.println("LUNCH:");
        printMenu(lunch.createIterator());
    }

    public static void main(String [] args) {
        MenuPrinter2 mp = new MenuPrinter2();
        mp.printAllMenus();
    }
}
