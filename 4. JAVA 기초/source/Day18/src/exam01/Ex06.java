package exam01;

import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.printf("1~100까지의 합은 %d입니다.%n", sum);

        int sum2 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).sum();
        System.out.printf("1~100까지 중 홀수의 합은 %d입니다.%n", sum2);

        int sum3 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).map(i -> i*i).sum();
        System.out.printf("1~100까지 중 홀수의 제곱의 합은 %d입니다.%n", sum3);
    }
}
