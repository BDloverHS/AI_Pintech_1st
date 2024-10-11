package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 15;
        if (num1 == 10) { // 조건식이 참일 때 실행
            System.out.println("10입니다.");
        } else {
            // 조건이 참이 아닐 때 실행
            System.out.println("10이 아닙니다.");
        }

        int num2 = 15;
        if (num2 <= 5) {
            // 조건식1이 참일 때 실행되는 코드
        } else if (num2 <10) {
            // 조건식2가 거짓일 때 실행되는 코드
        } else {
            // 모든 조건식이 거짓일 때 실행되는 코드
        }
    }
}