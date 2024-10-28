package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 {
    public static void main(String[] args) {
        // 지네릭에서 자료형을 선언할 때는 기본 자료형이 아닌 참조 자료형을 넣어야 한다.
        /*
        BiFunction<Integer, Integer, Integer> cal = (a,b) -> a + b;
        int result = cal.apply(10,20);
        System.out.println(result);
        */
        /*BinaryOperator<Integer> cal = (a, b) -> a+b;
        int result = cal.apply(10,20);
        System.out.println(result);*/
        IntBinaryOperator cal = (a, b) -> a+b;
        int result = cal.applyAsInt(10,20);
        System.out.println(result);
    }
}
//