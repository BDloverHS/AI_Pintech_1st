package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 부호 연산자 - 부호 반전 (-)
        int num1 = 10;
        int num2 = num1 * (-1);
        // 위를 축약하면 아래처럼 가능
        int num3 = -num1;
        System.out.println(num2);
        System.out.println(num3);

        // 음수에 마이너스를 붙여도 된다.
        int num4 = -num3;
        System.out.println(num4);
    }
}
