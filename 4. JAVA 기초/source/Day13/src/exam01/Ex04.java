package exam01;

import java.util.function.ToIntFunction;

public class Ex04 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length();

        // ::은 메서드 참조를 의미
        ToIntFunction<String> func2 = String::length;
    }
}
