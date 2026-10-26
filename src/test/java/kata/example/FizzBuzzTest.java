package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    public void mult3(){
        FizzBuzz f=new FizzBuzz(3);
        assertEquals(f.mult3(), "Fizz");
    }
    @Test
    public void mult5(){
        FizzBuzz f=new FizzBuzz(5);
        assertEquals(f.mult5(), "Buzz");
    }
    @Test
    public void Num(){
        FizzBuzz f=new FizzBuzz(7);
        assertEquals(f.mult5(), "7");
        assertEquals(f.mult3(), "7");
    }
    @Test
    public void Ambos(){
        FizzBuzz f=new FizzBuzz(15);
        assertEquals(f.mult3y5(), "FizzBuzz");
    }
    @Test
    public void Ninguno(){
        FizzBuzz f=new FizzBuzz(3);
        assertEquals(f.mult3y5(), "3");
    }
}
