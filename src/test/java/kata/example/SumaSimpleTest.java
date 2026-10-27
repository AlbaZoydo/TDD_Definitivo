package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaSimpleTest {
    //Suma de numeros separados por comas
    @Test 
    public void coma(){
        SumaSimple s=new SumaSimple("1,2,3");
        assertEquals("6", s.suma());
        s.set("2,3,4,5,6,7");
        assertEquals("27", s.suma());
        
    }
    //Sema de entero y decimal
    @Test
    public void coma2(){
        SumaSimple s=new SumaSimple("1,2,3.5");
        assertEquals("6.5", s.suma());
        s.set("1,2,3,4.3");
        assertEquals("10.3", s.suma());
    }
    //mensaje vacio
    @Test 
    public void vacio(){
        SumaSimple s=new SumaSimple("");
        assertEquals("0", s.suma());

    }
    //2 delimitadores juntos
    @Test 
    public void comasjuntas(){
        SumaSimple s=new SumaSimple("1,,2,3");
        assertEquals("Dos delimitadores juntos", s.suma());
        s.set("1,\n2,3");
        assertEquals("Dos delimitadores juntos", s.suma());

    }
    //Suma de numeros separados por saltos de linea
    @Test 
    public void saltador(){
        SumaSimple s=new SumaSimple("1\n2\n3");
        assertEquals("6", s.suma());
        s.set("1,2\n3");
        assertEquals("6", s.suma());
    }
    //Error: no puede terminar con el marcador
    @Test 
    public void comafinal(){
        SumaSimple s=new SumaSimple("1,2,3,");
        assertEquals("Error: cadena no valida", s.suma());

    }
    //Marcador diferente, pero con las mismas reglas
    @Test 
    public void Otro_marcador(){
        SumaSimple s=new SumaSimple("//;\n1;2;3");
        assertEquals("6", s.suma());
        s.set("//g\n1g2g3g4g5g6g7g8g9g");
        assertEquals("Error: cadena no valida", s.suma());
        s.set("//set\n1set2set3set1");
        assertEquals("7", s.suma());

    }

    @Test 
    public void Otro_marcador2(){
        SumaSimple s=new SumaSimple("//;\n1;2;\n3");
        assertEquals("Dos delimitadores juntos", s.suma());
        s.set("//g\n1g2g9g,3");
        assertEquals("Dos delimitadores juntos", s.suma());
        s.set("//g\n1g2g9g,3");
        assertEquals("Dos delimitadores juntos", s.suma());

    }
    
    //Marcador no valido
    @Test 
    public void Otro_marcador3(){
        SumaSimple s=new SumaSimple("//2\n12223");
        assertEquals("Error: simbolo no valido", s.suma());
    }
    
}
