package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {
    //Suma de numeros separados por comas
    @Test 
    public void coma(){
        Suma s=new Suma("1,2,3");
        assertEquals("6", s.suma());
        s.set("2,3,4,5,6,7");
        assertEquals("27", s.suma());
        
    }
    //mensaje vacio
    @Test 
    public void vacio(){
        Suma s=new Suma("");
        assertEquals("0", s.suma());

    }
    //Error: no puede terminar con el marcador
    @Test 
    public void comafinal(){
        Suma s=new Suma("1,2,3,");
        assertEquals("Error: cadena no valida", s.suma());

    }
    //Marcador diferente, pero con las mismas reglas
    @Test 
    public void Otro_marcador(){
        Suma s=new Suma("//;\n1;2;3");
        assertEquals("6", s.suma());
        s.set("//g\n1g2g3g4g5g6g7g8g9g");
        assertEquals("Error: Cadena no valida", s.suma());
        
    }
    //Marcador no valido
    @Test 
    public void Otro_marcador3(){
        Suma s=new Suma("//2\n12223");
        assertEquals("Error: simbolo no valido", s.suma());
    }
    
}
