package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @After
    public void tearDown(){
        Add.clearAllAdds();//clear out added hero after test
    }
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
    @Test
    public void AllAddsareCorrectlyReturned_true(){
        Add add =new Add ("batman");
        Add otherAdd = new Add ("spiderman");
        assertEquals(2, Add.getAll().size());
    }
    @Test
    public  void AllAddsContainaAllAdds_true(){
        Add add = new Add ("batman");
        Add otherAdd = new Add ("spiderman");
        assertTrue(Add.getAll().contains(add));
        assertTrue(Add.getAll().contains(otherAdd));
    }
    @Test
    public void getAge_AddsInstantiateWith_Age() throws Exception{
        Add.clearAllAdds();
        Add myAdd = new Add ("batman");
        assertEquals(0,myAdd.getAge());
    }
}