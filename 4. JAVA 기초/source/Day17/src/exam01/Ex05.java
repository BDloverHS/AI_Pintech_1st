package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
    public static void main(String[] args) {
        String[] words = {"이름3", "이름5", "이름4", "이름1", "이름2"};
        Arrays.sort(words, Comparator.reverseOrder());

        System.out.println(Arrays.toString(words));
    }
}
