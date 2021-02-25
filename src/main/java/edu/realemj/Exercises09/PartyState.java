package edu.realemj.Exercises09;

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
}
