package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("CodeClan Green", 0);
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Green", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(0, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }
}
