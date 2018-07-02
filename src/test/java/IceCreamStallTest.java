import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Creams", "Zsolt", 14);
    }

    @Test
    public void hasName(){
        assertEquals("Ice Creams", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Zsolt", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(14, iceCreamStall.getParkingSpot());
    }
}
