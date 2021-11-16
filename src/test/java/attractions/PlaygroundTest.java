package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor_1;
    Visitor visitor_2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Play Park", 7);
        visitor_1 = new Visitor(15,170, 10);
        visitor_2 = new Visitor(12, 120, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Play Park", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void doesNotAllow15OrOver() {
        assertEquals(false, playground.isAllowedTo(visitor_1));
    }

    @Test
    public void allowsUnder15() {
        assertEquals(true, playground.isAllowedTo(visitor_2));
    }
}
