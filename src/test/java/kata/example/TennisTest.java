package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TennisTest {
    //Probar marcadores iguales
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
    //Probar los puntos de los jugadores
    @Test
    public void solo(){
        Tennis t=new Tennis(0,30);
        assertEquals("Love | Thirty", t.puntos() );
    }

    //Probar los puntos del jugador 1
    @Test
    public void solo1(){
        Tennis t=new Tennis(0,30);
        assertEquals("Love | Thirty", t.puntos() );
        t.setp1(15, 1);
        assertEquals("Fifteen | Thirty", t.puntos());
        t.setp1(30,1);
        assertEquals("Thirty | All", t.puntos() );
        t.setp1(40,1);
        assertEquals("Forty | Thirty", t.puntos());
    }
    //Marcadores de jugador 2
    @Test
    public void solo2(){
        Tennis t=new Tennis(15,0);
        assertEquals("Fifteen | Love", t.puntos() );
        t.setp1(15, 2);
        assertEquals("Fifteen | All", t.puntos());
        t.setp1(30,2);
        assertEquals("Fifteen | Thirty", t.puntos() );
        t.setp1(40,2);
        assertEquals("Fifteen | Forty", t.puntos());
    }
    //Casos que no se pueden dar en un partido de tenis
    @Test 
    public void conflictos(){
        Tennis t=new Tennis(5,0);
        assertEquals("Error | Love", t.puntos() );
        
    }
}