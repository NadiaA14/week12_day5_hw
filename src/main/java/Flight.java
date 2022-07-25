import Person.*;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember>cabinCrew;
    private ArrayList<Passenger>bookedPassengers;

    private Plane plane;

    private Flight flight;
    private Pilot pilot;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, Pilot pilot, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
    }

    public int bookedPassengers(){
        return this.bookedPassengers.size();
    }


    public void addPassenger(Passenger passenger) {
        if (bookedPassengers.size() < plane.getCapacity()){
            bookedPassengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - bookedPassengers();
    }
}
