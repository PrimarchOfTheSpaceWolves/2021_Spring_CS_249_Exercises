package edu.realemj.Exercises05;

import java.util.Scanner;

public class GeneralStore {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int totalFood = 0;
        int foodToBuy = -1;

        while(foodToBuy != 0) {
            System.out.println("How much food?");
            foodToBuy = input.nextInt();
            totalFood += foodToBuy;
            if(totalFood < 0) {
                foodToBuy -= totalFood;
                totalFood = 0;
            }

            if(foodToBuy < 0) {
                System.out.println("Food sold: " + (-foodToBuy));
            }
            else {
                System.out.println("Food bought: " + foodToBuy);
            }
            System.out.println("Total food: " + totalFood);
        }

        System.out.println("Have a pleasant day!");
    }
}
