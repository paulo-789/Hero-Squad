package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void Instance(){
        Add myHero = new Add("batman",17,"night vision","light");
                assertEquals("Batman",myHero instanceof Add);
    }
    @Test
    public void nameOfHero(){
        Add myHero = new Add("batman",17,"night vision","light");
        assertEquals("batman",myHero.getName());
    }
    @Test
    public void  ageOfHero(){
        Add myHero = new Add ("batman",17,"night vision","light");
        assertEquals("batman",myHero.getAge());
    }
    @Test
    public  void power(){
        Add myHero= new Add ("batman",17,"night vision","light");
        assertEquals("batman",myHero.getPower());
    }
    @Test
    public void weakness(){
        Add myHero = new Add("batman",17,"night vision","light");
        assertEquals("batman",myHero.getWeakness());
    }
    @Test
    public void list() {
        Add firstHero = new Add("batman", 17, "night vision", "light");
        Add secondHero = new Add("batman", 17, "night vision", "light");
        assertTrue(Add.getAll().contains(firstHero));
        assertTrue(Add.getAll().contains(secondHero));
    }
    @Test
    public void  assighnId() {
        Add.clear();
        Add myHero = new Add("batman", 17, "night vision", "light");
        assertEquals(1, myHero.getId());
    }
    @Test
    public  void  findSpecific_hero(){
        Add first = new Add("batman", 17, "night vision", "light");
        Add secondHero= new Add("batman", 17, "night vision", "light");
        assertEquals(Add.find(secondHero.getId()), secondHero);
    }

}