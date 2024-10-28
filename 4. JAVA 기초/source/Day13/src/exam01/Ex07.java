package exam01;

import java.util.Optional;

public class Ex07 {
    public static void main(String[] args) {
        Optional<Book> opt = Optional.empty();
        // Book book = opt.orElseGet(()->new Book());
        // 람다식으로 줄임
        Book book = opt.orElseGet(Book::new);
    }
}
