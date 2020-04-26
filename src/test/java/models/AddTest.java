package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void NewAddObjectGetsCorrectlyCreated_true() throws Exception{
        Add add = new Add("batman");
        assertEquals(true, add instanceof Add);
    }
    @Test
    public void AddInstantiatesWithContent_true() throws Exception{
        Add add = new Add("batman");
        assertEquals("batman",add.getContent()); //making sure we can retrive each hero we add.
    }
}