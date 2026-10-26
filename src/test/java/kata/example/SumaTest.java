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
    @Test 
    public void Otro_marcador(){
        Suma s=new Suma("//;\n1;2;3");
        assertEquals(6, s.suma());
        
    }
    @Test 
    public void Otro_marcador2(){
        Suma s=new Suma("//g\n1g2g3g4g5g6g7g8g9g");
        assertEquals(45, s.suma());
        
    }
}
