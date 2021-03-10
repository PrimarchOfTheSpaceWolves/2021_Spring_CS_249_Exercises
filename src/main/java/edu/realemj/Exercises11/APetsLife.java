package edu.realemj.Exercises11;

import java.util.Scanner;

public class APetsLife {
    public static void main(String [] args) {
        Cat g = new Cat("Garfield", 500);
        g.meow();
        g.yowl();
        Cat h = new Cat("Heithcliff", 800);
        h.meow();

        System.out.println("Enter name and age:");
        Scanner catReader = new Scanner(System.in);
        String n = catReader.next();
        int a = catReader.nextInt();
        Cat myCat = new Cat(n, a);
        myCat.meow();
    }
}
