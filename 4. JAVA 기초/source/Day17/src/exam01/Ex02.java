package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        // 변경불가 List
        List<String> items = Arrays.asList("항목1", "항목2", "항목3");
        System.out.println(items);

        // 변경 불가 List
        List<String> items2 = List.of("항목1","항목2","항목3");
        System.out.println(items2);

    }
}
