package ex4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal;

    @Before
    public void before() {
        Animal animal = new Animal("Pieter");
        animal.setAge(27);
    }

    @Test
    public void getName() {
        assertEquals("Pieter", animal.getName());
    }

    @Test
    public void getAge() {
        assertEquals(27, animal.getAge());
    }

    @Test
    public void setAge() {
        animal.setAge(28); // Happy BDay!
        assertEquals(28, animal.getAge());
    }
}
