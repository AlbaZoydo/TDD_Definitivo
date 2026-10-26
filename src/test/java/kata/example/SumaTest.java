package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {
    @Test 
    public void coma(){
        Suma s=new Suma("1,2,3");
        assertEquals(6, s.suma());
        
    }
    @Test 
    public void coma2(){
        Suma s=new Suma("2,3,4,5,6,7");
        assertEquals(27, s.suma());
        
    }
    @Test 
    public void vacio(){
        Suma s=new Suma("");
        assertEquals(0, s.suma());

    }
    @Test 
    public void comafinal(){
        Suma s=new Suma("1,2,3,");
        assertEquals(6, s.suma());

    }
}
