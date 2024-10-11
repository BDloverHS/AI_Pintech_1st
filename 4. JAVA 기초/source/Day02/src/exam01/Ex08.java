package exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num1 = 10;
        num1 += 2;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);

        int num = 10;
        num /= 3;
        // 10 / 3 은 3.333333 이지만 절사가 되어 정수만 나온다.
        System.out.println(num);
    }
}
