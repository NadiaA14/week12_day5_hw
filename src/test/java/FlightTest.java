import Person.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane;
    Flight flight;
    Passenger passenger;
    Pilot pilot;

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        passenger = new Passenger("Jenny", 3);
        plane = new Plane(PlaneType.SMALL);
        flight = new Flight(plane, pilot, "FR756", "EDI", "GLA", "10:15");
        pilot = new Pilot("Joshua", Rank.CAPTAIN, "TZ990");
        cabinCrewMember = new CabinCrewMember("Clara", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetBookedPassengersList(){
        assertEquals(0, flight.bookedPassengers());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(48, flight.getAvailableSeats());
    }

    @Test
    public void canAddToPassengersList(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.bookedPassengers());
    }
}
