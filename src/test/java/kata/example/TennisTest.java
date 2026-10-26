package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TennisTest {
    @Test
    public void iguales(){
        Tennis t=new Tennis(0,0);
        assertEquals("Love | All", t.puntos() );
        
    }
    @Test
    public void iguales15(){
        Tennis t=new Tennis(15,15);
        assertEquals("Fifteen | All", t.puntos() );
        
    }
    @Test
    public void iguales30(){
        Tennis t=new Tennis(30,30);
        assertEquals("Thirty | All", t.puntos() );
        
    }
    @Test
    public void iguales40(){
        Tennis t=new Tennis(40, 40);
        assertEquals("Deuce | All", t.puntos() );
        
    }
}