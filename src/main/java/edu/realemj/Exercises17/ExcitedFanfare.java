package edu.realemj.Exercises17;

public class ExcitedFanfare<E> extends Fanfare<E> {
    public ExcitedFanfare(E e) {
        super(e);
    }

    @Override
    public void announce() {
        System.out.println("OH BOY IT'S..." + getThing());
    }
}
