package exam01;

import java.util.function.BiPredicate;

public class Ex05 {
    public static void main(String[] args) {
        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        // 순서가 바뀌지 않으면 메서드 참조 사용 가능
        BiPredicate<String, String> cond2 = String::equals;

        // 순서가 바뀌어서 메서드 참조를 할 수 없음.
        BiPredicate<String, String> cond3 = (s1, s2) -> s2.equals(s1);
    }
}
