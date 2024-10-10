package exam03;

public class Ex02 {
    public static void main(String[] args) {
        // num : 초기값, 초기화식
        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while (num < 1);
        System.out.println(total);
    }
}
