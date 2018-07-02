import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Creams", "Zsolt", 14, 5);
        visitor = new Visitor(12, 200, 3);
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

    @Test
    public void canSellIceCream(){
        iceCreamStall.sellIceCream(visitor);
        assertEquals(0.2, visitor.getMoney(), 0.01);
    }
}
