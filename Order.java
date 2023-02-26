import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private final long id;
    private final String name;
    private final List<Item> itemList;
    private final LocalDateTime createDate;

    public Order(long id, String name, List<Item> itemList, LocalDateTime createDate) {
        this.id = id;
        this.name = name;
        this.itemList = itemList;
        this.createDate = createDate;
    }

    public List<Item> getItemList() {return itemList;}
    public LocalDateTime getCreateDate() {return createDate;}

    @Override
    public String toString() {
        return String.format("Order{id=%d name=%s}", id, name);
    }
}
