import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void setUp() {
        busStop = new BusStop("High Street");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("High Street", busStop.hasName());
    }

    @Test
    public void hasEmptyQueue() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromQueue() {
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.queueCount());
    }
}
