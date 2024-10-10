package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;

        // 대입 연산 먼저 발생 -> 그 후, 증가 연산
        int num2 = num1++;

        // 증가 연산 먼저 발생 -> 그 후, 대입 연산
        int num3 = ++num1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
