import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;

    @Before
    public void setUp() {
        bus = new Bus("Edinburgh Castle", 40);
    }

    @Test
    public void hasDestination() {
        assertEquals("Edinburgh Castle", bus.hasDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(40, bus.hasCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

}
