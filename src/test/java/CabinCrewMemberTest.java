import Person.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;


    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Louise", Rank.CAPTAIN);
    }

    @Test
    public void hasName(){
        assertEquals("Louise", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

}
