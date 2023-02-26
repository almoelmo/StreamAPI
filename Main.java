import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Streams streams = new Streams();

        List<String> families = List.of("Иванов", "Петров", "Сидоров", "Кузнецов", "Иванов", "Абрамов");

        streams.getFamiliesOnLetter(families, "и");

        streams.getSortedWords();

        List<Item> items = List.of(new Item(1,"колбаса"), new Item(2, "сметана"));
        List<Order> orders = List.of(new Order(1, "заказ1", items, LocalDateTime.now()),
                                     new Order(2, "заказ2", items, LocalDateTime.now().plusDays(2)));

        streams.findOrdersBetweenDates(orders, LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(3))
                .forEach(System.out::println);


        streams.findItemsByNameAndDate(orders, LocalDateTime.now().minusDays(2), LocalDateTime.now().plusDays(3), "колб")
                .forEach(System.out::println);
    }
}