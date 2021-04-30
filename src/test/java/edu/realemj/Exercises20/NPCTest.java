package edu.realemj.Exercises20;

import org.testng.annotations.*;
import org.testng.Assert;

public class NPCTest {
    @Test()
    public void dummy() {
        System.out.println("HELLO!");
    }

    public void nonsense() {
        System.out.println("NONSENSE!");
    }

    @Test()
    public void checkGetters() {
        NPC dude = new NPC("Gandalf", 1827);
        Assert.assertEquals(dude.getName(), "Gandalf");
        Assert.assertEquals(dude.getAge(), 1827, "Age incorrect!");

        NPC merlin = new NPC("Merlin", -1000);
        Assert.assertEquals(merlin.getAge(), 0, "Bad negative age!");
    }

    @Test()
    public void checkAgeSetter() {
        NPC a = new NPC("Bob", 10);
        for(int age = -5; age <= 5; age++) {
            a.setAge(age);
            Assert.assertTrue(a.getAge() >= 0);

            if(age < 0) {
                Assert.assertEquals(a.getAge(), 0);
            }
            else {
                Assert.assertEquals(a.getAge(), age);
            }
        }
    }
}
