package edu.realemj.Exercises13;

import java.util.*;

public class SortPersons {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter names:");
        Person [] people = new Person[5];
        for(int i = 0; i < people.length; i++) {
            String name = input.nextLine();
            people[i] = new Person(name);
        }

        Arrays.sort(people);

        for(Person p: people) {
            System.out.println("- " + p);
        }
    }
}
