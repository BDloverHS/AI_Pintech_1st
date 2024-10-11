package exam01;

public class Ex01 {
    /**
     * main 함수는 프로그램을 시작해 주는 함수
     * @param args
     */
    public static void main(String[] args) {
        //  void : 반환 값이 없을 때 자료형
        //  return 예약어를 사용하지 않아도 됨.(자바 한정)
        // 변수명이 같아도 같은 변수가 아니다.
        // main 함수의 지역변수
        int num1 = 10;
        int num2 = 20;
        int r = add(10, 20);
        System.out.println(r);
    }
    // num1과 num2는 매개변수이다. num1, num2 그 자체는 변수가 아니다.
    // 함수가 실행할 때 변수가 됨.

    /**
     * num1, num2, result - 함수 지역 내에서만 유의미한 변수
     * - 지역변수
     * @param num1
     * @param num2
     */

    static int add(int num1, int num2) { // 함수 지역 변수
        int result = num1 + num2;
        return result;
    }
}
