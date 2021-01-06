import java.util.ArrayList;

public class BusStop {
    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String hasName() {
        return this.name;
    }

    public int queueCount() {
        return this.queue.size();
    }

    public void addPerson(Person person) {
        this.queue.add(person);
    }
}
