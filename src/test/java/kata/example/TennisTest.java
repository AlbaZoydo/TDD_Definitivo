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
    public void solo(){
        Tennis t=new Tennis(0,30);
        assertEquals("Love | Thirty", t.puntos() );
    }

    //Metodo para probar los puntos de los jugadores
    @Test
    public void solo1(){
        Tennis t=new Tennis(0,30);
        assertEquals("Love | Thirty", t.puntos() );
        t.setp1(15);
        assertEquals("Fifteen | Thirty", t.puntos());
        t.setp1(30);
        assertEquals("Thirty | All", t.puntos() );
        t.setp1(40);
        assertEquals("Forty | Thirty", t.puntos());
    }
}