package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {
    @Test 
    public void coma(){
        Suma s=new Suma("1,2,3");
        assertEquals(6, s.suma());
        s.set("2,3,4,5,6,7");
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
    @Test 
    public void Otro_marcador(){
        Suma s=new Suma("//;\n1;2;3");
        assertEquals(6, s.suma());
        s.set("//g\n1g2g3g4g5g6g7g8g9g");
        assertEquals(45, s.suma());
        
    }
    @Test 
    public void Otro_marcador3(){
        Suma s=new Suma("//2\n12223");
        assertEquals(-1, s.suma());
    }
}
