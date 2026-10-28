package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicarTest {
    @Test
    public void multiplicar(){
        Suma s=new Suma("1,2,3");
        assertEquals("6", s.multiplica());
        s.set("2,3,4,5,6,7");
        assertEquals("5040", s.multiplica());
        
    }
    //Sema de entero y decimal
    @Test
    public void multiplicar2(){
        Suma s=new Suma("1,2,3.5");
        assertEquals("7", s.multiplica());
        s.set("1,2,3,4.3");
        assertEquals("25,8", s.multiplica());
    }
    //mensaje vacio
    @Test 
    public void multiplicarvacio(){
        Suma s=new Suma("");
        assertEquals("1", s.multiplica());

    }
    //2 delimitadores juntos
    @Test 
    public void multiplicarcomasjuntas(){
        Suma s=new Suma("1,,2,3");
        assertEquals("Error: Number expected but , found at position 2", s.multiplica());
        s.set("1,\n2,3");
        assertEquals("Error: Number expected but \n found at position 2", s.multiplica());

    }
    //Suma de numeros separados por saltos de linea
    @Test 
    public void multiplicarsalto(){
        Suma s=new Suma("1\n2\n3");
        assertEquals("6", s.multiplica());
        s.set("1,2\n3");
        assertEquals("6", s.multiplica());
    }
    //Error: no puede terminar con el marcador
    @Test 
    public void multiplicarcomafinal(){
        Suma s=new Suma("1,2,3,");
        assertEquals("Error: cadena no valida", s.multiplica());

    }
    //Marcador diferente, pero con las mismas reglas
    @Test 
    public void multiplicarOtro_marcador(){
        Suma s=new Suma("//;\n1;2;3");
        assertEquals("6", s.multiplica());
        s.set("//g\n1g2g3g4g5g6g7g8g9g");
        assertEquals("Error: cadena no valida", s.multiplica());
        s.set("//set\n1set2set3set1");
        assertEquals("6", s.multiplica());

    }

    @Test 
    public void multiplicarOtro_marcador2(){
        Suma s=new Suma("//;\n1;2;\n3");
        assertEquals("Error: ';' expected but '\\n' found at position 4", s.multiplica());
        s.set("//g\n1g2g9g,3");
        assertEquals("Error: 'g' expected but ',' found at position 6", s.multiplica());
        s.set("//g\n1g2g9g,3");
        assertEquals("Error: 'g' expected but ',' found at position 6", s.multiplica());

    }
    
    //Marcador no valido
    @Test 
    public void multiplicarOtro_marcador3(){
        Suma s=new Suma("//2\n12223");
        assertEquals("Error: simbolo no valido", s.multiplica());
    }
    //Numeros negativos no validos
    @Test
    public void multiplicarnegativos(){
        Suma s=new Suma("-1,2,-3");
        assertEquals("Error: Negatives not allowed: -1, -3", s.multiplica());
        s.set("//;\n-1;2;-3");
        assertEquals("Error: Negatives not allowed: -1, -3", s.multiplica());
    }
    //Multiple error
    @Test
    public void multiplicarmultiple_error(){
        Suma s=new Suma("//g\n-1g2g9gg-3");
        assertEquals("Error: Negatives not allowed: -1, -3\nError: 'g' expected but 'g' found at position 6", s.multiplica());
        s.set("//;\n-1;2;;3");
        assertEquals("Error: Negatives not allowed: -1\nError: ';' expected but ';' found at position 4", s.multiplica());
    }
    
}
