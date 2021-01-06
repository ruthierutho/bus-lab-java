import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String hasDestination() {
        return this.destination;
    }

    public int hasCapacity() {
        return this.capacity;
    }
}
