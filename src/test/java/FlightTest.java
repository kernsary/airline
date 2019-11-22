import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Plane plane1;

    @Before
    public void setup() {
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(plane1, "FR756", "CDG",
                "EDI", "1300");
    }

    @Test
    public void hasPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, flight1.getPassengers().size());
    }

    @Test
    public void hasFlightNum() {
        assertEquals("FR756", flight1.getFlightNum());
    }

    @Test
    public void hasDestination() {
        assertEquals("CDG", flight1.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight1.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("1300", flight1.getDepartureTime());
    }

    @Test
    public void canGetAvailableSeatsAtStart() {
        assertEquals(2, flight1.getAvailableSeats());
    }

    @Test
    public void canBookPassengerIfSeatsAvailable() {
        Passenger passenger1 = new Passenger("Alan Partridge", 3);
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getAvailableSeats());
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test
    public void cannotBookPassengerIfNoSeatsAvailable() {
        Passenger passenger1 = new Passenger("Alan Partridge", 3);
        Passenger passenger2 = new Passenger("Imelda Marcos", 68);
        Passenger passenger3 = new Passenger("Carlos Jackal", 1);
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        flight1.bookPassenger(passenger3);
        assertEquals(0, flight1.getAvailableSeats());
        assertEquals(2, flight1.getPassengers().size());
    }

}
