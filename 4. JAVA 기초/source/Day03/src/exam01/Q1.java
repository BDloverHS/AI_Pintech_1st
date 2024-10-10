package exam01;

public class Q1 {
    public static void main(String[] args) {
        // 1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오.
        int num1 = 20;
        // double num2 = 3; : 이 경우 3이 int 형으로 인식되므로 double로 바꾸는데 일을 2번하게 됨
        double num2 = 3.0; // 처음부터 실수형으로 제시를 하여 일을 줄여줌

        // int result = num1 * (int)num2 -> 오답.
        // -> 실수의 소수점 아래에 의해 결과 차이가 달라짐.
        // int result = (int)(num1 * num2) -> 정답.

    }
}
