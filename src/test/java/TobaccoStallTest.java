import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Cigarettes", "John", 10, 10);
        visitor = new Visitor(12, 140, 30);
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

    @Test
    public void visitorCannotBuyCigarettes(){
        tobaccoStall.sellTobacco(visitor);
        assertEquals(30, visitor.getMoney(), 0.1);
    }
}
