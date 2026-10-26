package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TennisTest {
    @Test
    public void solo1(){
        Tennis t=new Tennis(0,0);
        assertEquals("Love | All", t.puntos() );

    }
}