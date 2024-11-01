package exam01;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Set<Book> items = new HashSet<>();

        items.add(new Book(1000,"책1","작가1", "출판사1"));
        items.add(new Book(1001,"책2","작가2", "출판사2"));
        items.add(new Book(1001,"책2","작가2", "출판사2"));
        items.add(new Book(1002,"책3","작가3", "출판사3"));
        items.add(new Book(1003,"책4","작가4", "출판사4"));
        items.add(new Book(1004,"책5","작가5", "출판사5"));

        items.forEach(System.out::println);
    }
}
