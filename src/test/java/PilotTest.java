import Person.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Ashley", Rank.PILOT, "NA1234");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Ashley", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.PILOT, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNum(){
        assertEquals("NA1234", pilot.getLicence());
    }

}
