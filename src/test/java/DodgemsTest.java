import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems");
        visitor = new Visitor(11, 140, 2.50);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgems", dodgems.getName());
    }

    @Test
    public void under12GetsHalfPrice(){
        dodgems.sellTicket(visitor);
        assertEquals(0.25, visitor.getMoney(), 0.01);
    }
}
