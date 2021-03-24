package edu.realemj.Exercises12;

import java.io.IOException;
import java.util.Scanner;

public class Quotient {
    public static void dummyIO() throws IOException {
        // Any sort of code...
        throw new IOException("Bad input!");
    }

    public static void callDummy() throws IOException {
        try {
            System.out.println("Start callDummy");
            dummyIO();
            System.out.println("Middle callDummy");
        }
        catch(ArithmeticException e) {
            System.err.println("DOH!");
        }
        System.out.println("End callDummy");
    }

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
            callDummy();
        }
        catch(ArithmeticException e) {
            System.err.println("HELP HELP!");
            System.err.println(e.getMessage());
        }
        catch(IOException e) {
            System.err.println("IO with: " + e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e) {
            System.err.println("Uh oh");
        }

        System.out.println("Program done.");
    }
}
