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


}