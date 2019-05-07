package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class SheepTest {

    @Test
    public void canEqual() {
        Sheep sheep = new Sheep("Jon");
        Sheep sheep1 = new Sheep("Jon");
        Sheep sheep2 = new Sheep("Snow");

        System.out.println(sheep.canEqual(sheep2));
        // true

        System.out.println(sheep.equals(sheep1));
        // true
    }
}