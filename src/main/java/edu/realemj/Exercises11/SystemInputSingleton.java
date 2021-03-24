package edu.realemj.Exercises11;

import java.util.Scanner;

public class SystemInputSingleton {
    // INSTANCE STUFF - specific to a particular object
    private Scanner input = new Scanner(System.in);

    private SystemInputSingleton() {

    }

    public Scanner getScanner() {
        return input;
    }

    // STATIC STUFF - shared amongst everyone
    private static SystemInputSingleton instance = new SystemInputSingleton();

    public static SystemInputSingleton getInstance() {
        return instance;
    }
}
