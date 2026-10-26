package kata.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {
    @Test 
    public void coma(){
        Suma s=new Suma("1,2,3");
        assertEquals(6, s.suma());
        
    }
}
