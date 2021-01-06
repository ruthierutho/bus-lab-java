import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void setUp() {
        bus = new Bus("Edinburgh Castle", 4);
        person = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Edinburgh Castle", bus.hasDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bus.hasCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void passengerGetsOnBusIfRoomSuccess() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void passengerGetsOnBusIfRoomFail() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void passengerGetsOffBus() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
