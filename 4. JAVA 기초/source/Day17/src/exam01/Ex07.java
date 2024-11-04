package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book(1000, "책1", "작가1", "출판사1"),
                new Book(1001, "책2", "작가2", "출판사2"),
                new Book(1002, "책3", "작가3", "출판사3"),
                new Book(1003, "책4", "작가4", "출판사4"),
                new Book(1004, "책5", "작가5", "출판사5")
        ));

        Collections.shuffle(books);
        books.forEach(System.out::println);

        Book max = Collections.max(books);
        Book min = Collections.min(books);

        System.out.println("max" + max);
        System.out.println("min" + min);
    }
}
