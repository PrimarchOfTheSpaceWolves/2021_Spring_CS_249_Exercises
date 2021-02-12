package edu.realemj.Exercises04;

import java.util.Scanner;

public class StringFun {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text:");
        String line = s.nextLine();
        System.out.println("Length: " + line.length());
        System.out.println("Trimmed length: " + line.trim().length());

    }
}
