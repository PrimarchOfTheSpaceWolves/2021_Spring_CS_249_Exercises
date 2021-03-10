package edu.realemj.Exercises11;

import java.util.Scanner;

public class HowToTrainYourDragon {
    public static void main(String [] args) {
        Monster m = new FireDrake();

        m.attack();
        m.makeNoise();
        m.move();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 0:
                m = new Monster();
                break;
            case 1:
                m = new Dragon();
                break;
            case 2:
                m = new FireDrake();
                break;
            default:
                m = new Monster();
                break;
        }

        if(m instanceof FireDrake) {
            FireDrake f = (FireDrake) m;
            f.breatheFire();

            ((FireDrake) m).breatheFire();
        }
    }
}
