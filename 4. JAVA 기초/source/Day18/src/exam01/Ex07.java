package exam01;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {22,11,5,3, 66, 24, 98};
        int[] sortednNums = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(sortednNums));
    }
}
