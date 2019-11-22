import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void setup(){
        passenger1 = new Passenger("Alan Partridge", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Alan Partridge", passenger1.getName());
    }

    @Test
    public void hasNumOfBags(){
        assertEquals(3, passenger1.getNumOfBags());
    }
}
