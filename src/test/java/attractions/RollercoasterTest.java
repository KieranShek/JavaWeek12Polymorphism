package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor_1;
    Visitor visitor_2;
    Visitor visitor_3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster(8.40, "Blue Ridge", 10);
        visitor_1 = new Visitor(25, 190, 132);
        visitor_2 = new Visitor(18, 140, 120);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideCoaster() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor_1));
    }

    @Test
    public void canNotRideCoaster() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor_2));
    }

    @Test
    public void canGetPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void canGetPriceForTallPeople() {
        visitor_3 = new Visitor(55, 200, 120);
        assertEquals(16.80, rollerCoaster.priceForVisitor(visitor_3), 0.0);
    }
}
