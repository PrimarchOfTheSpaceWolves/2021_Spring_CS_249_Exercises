package edu.realemj.Exercises09;

import java.util.*;

public class TestPartyState {

    public static void main(String [] args) {
        String [] names = {"Obadiah", "MaryLouEllen", "Jeff"};
        PartyState p = new PartyState(names);
        p.printParty();
        p.randomKill();
        p.printParty();

        Scanner input = new Scanner(System.in);
        PartyState customParty = PartyState.createPartyFromUser(input);
        customParty.printParty();
    }
}
