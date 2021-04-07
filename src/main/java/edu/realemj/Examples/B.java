package edu.realemj.Examples;

public class B extends A {
    private int cnt = 0;
    public B(String name) {
        super(name);
    }

    public B(String name, int cnt) {
        super(name);
        this.cnt = cnt;
    }

    public void foo() {
        System.out.println("B!!!!!!!!!!");
    }
}