package edu.realemj.Exercises12;

public class ChainedExceptionDemo {
    public static void main(String [] args) {
        try {
            method1();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        }
        catch(Exception bob) {
            throw new Exception("live from 1", bob);
        }

    }

    public static void method2() throws Exception {
        throw new Exception("live from 2");
    }
}
