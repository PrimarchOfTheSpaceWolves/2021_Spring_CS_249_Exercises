package edu.realemj.Exercises12;

import java.util.Scanner;

public class Quotient {
    public static int quotient(int number1, int number2) {
        if(number2 != 0) {
            int ans = number1 / number2;
            return ans;
        }
        else {
            throw new ArithmeticException("WHAT HAVE YOU DONE?");
        }
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int ans = quotient(a, b);
            System.out.println(a + "/" + b + " = " + ans);
        }
        catch(ArithmeticException e) {
            System.err.println("HELP HELP!");
            System.err.println(e.getMessage());
        }

        System.out.println("Program done.");
    }
}
