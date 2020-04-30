package models;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class SquadTest{
    @Test
    public void Instance(){
        Squad mySquad = new Squad(5,"keepers","protect");
        assertEquals(true,mySquad instanceof Squad);
    }
    @Test
    public void correct_size(){
        Squad mySquad=new Squad(5,"keepers","protect");
        assertEquals(5,mySquad .getSize());
    }
    @Test
    public void  squad_Is_Correct(){
        Squad mySquad = new Squad(5,"keepers","protect");
        assertEquals("keepers",mySquad.getSquad());
    }
    @Test
    public void mission_Is_Correct(){
        Squad mySquad=new Squad(5,"keepers","protect");
        assertEquals("protect",mySquad.getMission());
    }
    @Test
    public void get_All_List(){
        Squad firstSquad = new Squad(5,"keepers","protect");
        Squad secondSquad= new Squad(5,"keepers","protect");
        assertTrue(Squad.getAll().contains(firstSquad));
        assertTrue(Squad.getAll().contains(secondSquad));
    }
    @Test
    public void  finding_The_Id(){
        Squad.clear();
        Squad mySquad = new Squad(5,"keepers","protect");
        assertEquals(1,mySquad.findid());
    }
    @Test
    public void clear_All(){
        Squad.clear();
    }

}