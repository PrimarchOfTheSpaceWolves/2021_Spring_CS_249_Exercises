package edu.realemj.Exercises06;

import java.util.Scanner;

public class PriceIsRight {
    public static String getRandomItem() {
        String [] itemList = {
          "washing machine",
          "microwave",
          "game console",
          "lamp",
          "fridge"
        };

        System.out.println("Our selection includes...");
        for(String s: itemList) {
            System.out.println("* " + s);
        }

        int index = (int)(Math.random()*itemList.length);
        return itemList[index];
    }

    public static int getRandomPrice(String name) {
        // Random price: 1 to 1000
        int price = 1 + (int)(Math.random()*1000);
        return price;
    }

    public static int askForPlayerGuess(Scanner in,
                                        String name) {
        System.out.println(name + ", what is your guess?");
        int guess = in.nextInt();
        return guess;
    }

    public static String[] askForPlayerNames(Scanner input) {
        System.out.println("Enter number of players:");
        int playerCnt = input.nextInt();
        String [] players = new String[playerCnt];
        for(int i = 0; i < playerCnt; i++) {
            System.out.println("Player " + (i+1)
                    + ", enter your name:");
            players[i] = input.next();
        }
        return players;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String [] gamePlayers = askForPlayerNames(input);
        int [] guesses = new int[gamePlayers.length];

        while(true) {
            String itemName = getRandomItem();
            int itemPrice = getRandomPrice(itemName);

            System.out.println("The item is: " + itemName + "!");
            /*
            int guess1 = askForPlayerGuess(input, "Player 1");
            int guess2 = askForPlayerGuess(input, "Player 2");

            int diff1 = Math.abs(guess1 - itemPrice);
            int diff2 = Math.abs(guess2 - itemPrice);
             */

            for(int i = 0; i < gamePlayers.length; i++) {
                guesses[i] = askForPlayerGuess(input, gamePlayers[i]);
                guesses[i] = Math.abs(guesses[i] - itemPrice);
            }

            System.out.println("Actual price: " + itemPrice);

            int bestIndex = 0;

            for(int i = 0; i < guesses.length; i++) {
                if(guesses[i] < guesses[bestIndex]) {
                    bestIndex = i;
                }
            }

            System.out.println(gamePlayers[bestIndex] + " wins!");
            System.out.println("***************************");
            /*
            if(diff1 < diff2) {
                System.out.println("Player 1 wins!");
            }
            else if(diff1 > diff2) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("It's a tie!");
            }

             */
        }
    }
}
