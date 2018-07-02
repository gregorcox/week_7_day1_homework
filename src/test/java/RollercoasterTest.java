import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setup(){
        rollercoaster = new Rollercoaster("Rollercoaster", 10);
        visitor = new Visitor(30, 180, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canSellTicket(){
        rollercoaster.sellTicket(visitor);
        assertEquals(11.60, visitor.getMoney(), 0.1);
    }
}
