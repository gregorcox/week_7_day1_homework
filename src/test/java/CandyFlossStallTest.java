import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Floss", "Tony", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Candy Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Tony", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpotNumber(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}
