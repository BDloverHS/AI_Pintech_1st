package exam03;

public class A {
    int num1; // default : 동일 패키지 내에서만 접근 가능
    public int num2; // public : 다른 패키지더라도 접근 가능
    private int num3; // private : 클래스 내부에서만 접근 가능

    public void method() { // 클래스 내부 - 클래스 내에 정의된 메서드 정의 내부
        num3 = 100;
        System.out.println(num3);
    }
}
