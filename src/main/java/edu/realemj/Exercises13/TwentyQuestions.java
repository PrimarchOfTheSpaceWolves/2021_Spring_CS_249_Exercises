package edu.realemj.Exercises13;

import java.util.*;

public class TwentyQuestions {
    public static void main(String [] args) {
        ArrayList<Edible> allFood = new ArrayList<>();
        allFood.add(new Chicken());
        allFood.add(new Apple());
        allFood.add(new Chicken());
        allFood.add(new Apple());

        for(Edible e: allFood) {
            System.out.println(e.howToEat());
        }

    }
}
