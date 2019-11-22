import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int availableSeats;


    public Flight(Plane plane, String flightNum, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = this.plane.getPlaneTypeCapacity();
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public void bookPassenger(Passenger newPassenger) {
        if (this.availableSeats > 0) {
            this.passengers.add(newPassenger);
            this.availableSeats -= 1;
        }
    }

}
