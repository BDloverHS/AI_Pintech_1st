package exam03;

// abstract는 관례적으로 접근제어자 앞이나 뒤에 붙임(뒤가 더 관례적)
public abstract class Calculator {

    // 인스턴스 변수
    int num = 10;
    
    public Calculator() {
        System.out.println("Calculator 생성자 호출");
    }

    // 구현체가 없음
    public abstract int add(int num1, int num2);
    // public abstract int minus(int num1, int num2);
}
