package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TennisTest {
    @Test
    public void iguales(){
        Tennis t=new Tennis(0,0);
        assertEquals("Love | All", t.puntos() );
        //Meter puntos a los jugadores mediante el metodo set en Tennis
        t.set(15, 15);
        assertEquals("Fifteen | All", t.puntos() );
        t.set(30, 30);
        assertEquals("Thirty | All", t.puntos() );
        t.set(40, 40);
        assertEquals("Forty | All", t.puntos() );
    }

    @Test
    public void solo1(){
        Tennis t=new Tennis(15,30);
        assertEquals("Fifteen | Thirty", t.puntos() );
    }
}