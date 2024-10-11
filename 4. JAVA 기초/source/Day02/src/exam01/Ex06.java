package exam01;

public class Ex06 {
    public static void main(String[] args) {
        boolean result1 = 10 > 5;
        System.out.println("result1의 결과 : " + result1);

        int num1 = 50;
        boolean result2 = num1 >= 10;
        boolean result3 = num1 < 100;
        boolean result4 = result2 && result3;
        // 메모리를 절약할 수 있다.
        boolean result5 = num1 >= 10 && num1 < 100;

        System.out.println("----------------------------");
        System.out.println("result2의 결과 : " + result2);
        System.out.println("----------------------------");
        System.out.println("result3의 결과 : " + result3);
        System.out.println("----------------------------");
        System.out.println("result4의 결과 : " + result4);
        System.out.println("----------------------------");
        System.out.println("result5의 결과 : " + result5);
    }
}
