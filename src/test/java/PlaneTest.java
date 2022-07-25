import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CRAZY_BIG);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1000, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(5000, plane.getWeight());
    }
}
