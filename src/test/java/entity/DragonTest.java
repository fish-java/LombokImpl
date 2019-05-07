package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {
    @Test
    public void all(){
        Dragon dragon = new Dragon();
        dragon.setName("Jon");
        System.out.println(dragon);
    }
}