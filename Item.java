
public class Item {
    private final long id;
    private final String name;

    public Item(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {return name;}

    @Override
    public String toString() {
        return String.format("Item{id=%d name=%s}", id, name);
    }
}