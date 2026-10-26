package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TennisTest {
    @Test
    public void iguales(){
        Tennis t=new Tennis(0,0);
        assertEquals("Love | All", t.puntos() );
        
        Tennis t1=new Tennis(15,15);
        assertEquals("Fifteen | All", t.puntos() );
        
        Tennis t2=new Tennis(30,30);
        assertEquals("Thirty | All", t2.puntos() );
        
        Tennis t3=new Tennis(40, 40);
        assertEquals("Deuce", t3.puntos() );
        
    }
}