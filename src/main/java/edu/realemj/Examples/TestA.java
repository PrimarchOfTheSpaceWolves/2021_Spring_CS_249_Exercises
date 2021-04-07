package edu.realemj.Examples;

import java.util.ArrayList;

public class TestA {
    public static void main(String [] args) {
        ArrayList<A> myList = new ArrayList<>();

        for(A obj: myList) {
            if(obj instanceof B) {
                ((B)obj).foo();
            }
        }
    }
}
