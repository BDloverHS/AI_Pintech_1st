package exam01;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex02 {
    public static void main(String[] args) {
        Queue<String> items = new LinkedList<>();
        for (int i = 0; i < 5; i++) items.offer("항목" + (i + 1)); // 끝에 요소 더하기

        // System.out.println(items);

        while(!items.isEmpty()) {
            String item = items.poll(); // 첫번째 요소 꺼내기
            System.out.println(item);
        }
        System.out.println(items);
    }
}
