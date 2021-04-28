package edu.realemj.Exercises18.Iterator;

public class MenuPrinter1 {
    public static void main(String [] args) {
        MenuItem eggs = new MenuItem("Eggs", 4.99);
        MenuItem eggAndSpam = new MenuItem("Eggs and Spam", 6.00);

        System.out.println(eggs);
        System.out.println(eggAndSpam);

        BreakfastMenu bmenu = new BreakfastMenu();
        LunchMenu lmenu = new LunchMenu();

        System.out.println("BREAKFAST:");
        for(int i = 0; i < bmenu.getMenuItems().size(); i++) {
            System.out.println(bmenu.getMenuItems().get(i));
        }

        System.out.println("LUNCH:");
        for(int i = 0; i < lmenu.getCnt(); i++) {
            System.out.println(lmenu.getMenuItems()[i]);
        }

    }
}
