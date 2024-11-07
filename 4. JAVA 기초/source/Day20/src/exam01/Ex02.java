package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = {20, 10, 5, 99, 30, 1, 45 };
        int max = Arrays.stream(nums).reduce((a, b) -> a > b ? a : b).orElse(-1);
        System.out.println("최댓값 : " + max);

        int min = Arrays.stream(nums).reduce((a,b)-> a < b ? a : b).orElse(-1);
        System.out.println("최솟값 : " + min);
    }
}
