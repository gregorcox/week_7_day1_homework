import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Floss", "Tony", 2, 4);
        visitor = new Visitor(20, 200, 5);
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

    @Test
    public void canSellCandyFloss(){
        candyFlossStall.sellCandyFloss(visitor);
        assertEquals(0.80, visitor.getMoney(), 0.01);
    }
}
