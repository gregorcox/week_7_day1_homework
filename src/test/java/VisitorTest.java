import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(30, 180, 300);
    }

    @Test
    public void hasAge(){
        assertEquals(30, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney(){
        assertEquals(300, visitor.getMoney(), 0.1);
    }

}
