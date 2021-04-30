package edu.realemj.Exercises20;

public class NPC {
    private String name;
    private int age;

    public NPC(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
}
