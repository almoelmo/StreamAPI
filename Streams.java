import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streams {

    public void getFamiliesOnLetter(List<String> families, String letter){
        families.stream()
                .filter(item -> item.toLowerCase()
                .startsWith(letter.toLowerCase()))
                .forEach(System.out::println);
    }


    public void getSortedWords(){
        System.out.println("Введите слова через пробел");
        Stream.of(new Scanner(System.in)
                        .nextLine()
                        .split(" ")) /


            .filter(word ->{
                System.out.println(word);
                return true;
            }).sorted()
              .collect(Collectors.toList())
              .forEach(System.out::println);
    }


    public List<Order> findOrdersBetweenDates(List<Order> orders, LocalDateTime start, LocalDateTime finish){
        return orders.stream().filter(order -> order.getCreateDate().compareTo(start) >= 0)
                       .filter(order -> order.getCreateDate().compareTo(finish) <= 0)
                       .collect(Collectors.toList());
    }


    public List<Item> findItemsByNameAndDate(List<Order> orders, LocalDateTime start, LocalDateTime finish, String product){
        return orders.stream()
            .filter(order -> order.getCreateDate().compareTo(start) >= 0)
            .filter(order -> order.getCreateDate().compareTo(finish) <= 0)
            .flatMap(order -> order.getItemList().stream())
            .filter(item -> item.getName().toLowerCase().contains(product.toLowerCase()))
            .distinct()
            .collect(Collectors.toList());
    }
}
