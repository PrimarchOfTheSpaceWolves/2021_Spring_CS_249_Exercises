package edu.realemj.Exercises11;

public class Dragon extends Monster {
    @Override
    public void attack() {
        System.out.println("Dragon::attack");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dragon::makeNoise");
    }
}
