package edu.realemj.Exercises04;

import java.util.Scanner;

public class MathFun {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter angle in degrees:");
        double angle = input.nextDouble();
        System.out.println("Angle: " + angle);
        double rads = Math.toRadians(angle);
        System.out.println("Radians: " + rads);
        double sinVal = Math.sin(rads);
        System.out.println("Sin: " + sinVal);

        System.out.println("Enter whole number:");
        int cnt = input.nextInt();
        int index = (int)(Math.random()*cnt);
        System.out.println("Your lucky number is " + index);

    }
}
