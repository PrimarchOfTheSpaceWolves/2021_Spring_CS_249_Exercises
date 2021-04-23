package edu.realemj.Exercises18.Decorator;

public class CoffeeShop {
    public static void main(String [] args) {
        Beverage order = new DarkRoast();
        System.out.println(order.getClass() + "-->" + order);

        order = new Mocha(order);
        System.out.println(order.getClass() + "-->" + order);

        order = new Mocha(order);
        System.out.println(order.getClass() + "-->" + order);

        order = new Whip(order);
        System.out.println(order.getClass() + "-->" + order);
    }
}
