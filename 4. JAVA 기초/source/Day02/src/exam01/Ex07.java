package exam01;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * 단락 회로 평가
         * 논리 연산에서 이미 값이 결정된 경우 다음 항 연산 X
         */
        int num1 = 10;
        boolean result1 = num1++ > 10 && (num1 = num1 + 20) > 20;
        System.out.println(num1);
        System.out.println(result1);

        int num2 = 10;
        boolean result2 = ++num2 > 11 || (num2 = num2 + 20) < 30;
        System.out.println(num2);
        System.out.println(result2);
    }
}
