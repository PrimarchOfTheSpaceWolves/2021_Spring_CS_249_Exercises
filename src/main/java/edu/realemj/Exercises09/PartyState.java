package edu.realemj.Exercises09;

import java.util.*;
public class PartyState {
    private Person [] party;

    // String [] n = {"Bob", "Joe", "Sue" };
    // PartyState p = new PartyState(n);

    public PartyState(String [] names) {
        party = new Person[names.length];
        for(int i = 0; i < party.length; i++) {
            party[i] = new Person(names[i]);
        }
    }

    public void printParty() {
        System.out.println("PARTY:");
        /*
        for(int i = 0; i < party.length; i++) {
            if(party[i].isAlive()) {
                System.out.println("* " + party[i].getName());
            }
        }
         */
        for(Person p : party) {
            if(p.isAlive()) {
                System.out.println("* " + p.getName());
            }
        }
    }

    public boolean areAnyAlive() {
        boolean anyAlive = false;
        for(Person p : party) {
            if(p.isAlive()) {
                anyAlive = true;
                break;
                // ALT: return true
            }
        }
        return anyAlive;
        // ALT: return false
    }

    public void randomKill() {
        if(areAnyAlive()) {
            boolean found = false;
            do {
                int index = (int)(Math.random()*party.length);
                if(party[index].isAlive()) {
                    party[index].kill();
                    found = true;
                }
            }while(!found);
        }
    }

    public static PartyState createPartyFromUser(Scanner input) {
        System.out.println("Enter number of people:");
        int cnt = input.nextInt();
        String [] names = new String[cnt];

        System.out.println("Enter names:");
        for(int i = 0; i < cnt; i++) {
            names[i] = input.next();
        }

        PartyState p = new PartyState(names);
        return p;
    }
}
