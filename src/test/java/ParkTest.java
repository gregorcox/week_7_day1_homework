import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("The Park");
    }

    @Test
    public void hasName(){
        assertEquals("The Park", park.getName());
    }
}
