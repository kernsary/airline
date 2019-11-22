import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Plane plane1;

    @Before
    public void setup() {
        flight1 = new Flight(plane1, "FR756", "CDG", "EDI", "1300");
        plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, flight1.getPassengers().size());
    }
}
