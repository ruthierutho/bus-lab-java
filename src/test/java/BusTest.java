import org.junit.Before;

public class BusTest {
    private Bus bus;

    @Before
    public void setUp() {
        bus = new Bus("Edinburgh Castle", 40);
    }
}
