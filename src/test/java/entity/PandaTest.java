package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class PandaTest {

    @Test
    public void string() {
        Panda panda = new Panda();
        panda.setName("Jon");
        System.out.println(panda);
        // Panda(name=Jon)
    }
}