import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Cigarettes", "John", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Cigarettes", tobaccoStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("John", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(10, tobaccoStall.getParkingSpot());
    }
}
