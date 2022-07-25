import Person.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Chris", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Chris", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
