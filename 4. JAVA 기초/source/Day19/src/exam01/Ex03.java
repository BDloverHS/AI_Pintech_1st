package exam01;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> words = List.of("AA", "BBB", "CCC", "DDD", "EEEE");
        // 모든 조건이 참이면 참
        boolean result1 = words.stream().allMatch(s -> s.length() >= 3);
        System.out.println(result1);

        // 한 개라도 참이면 참
        boolean result2 = words.stream().anyMatch(s -> s.length() >= 4);
        System.out.println(result2);
    }
}