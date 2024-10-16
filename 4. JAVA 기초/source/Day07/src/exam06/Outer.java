package exam06;

public class Outer {

    int num1 = 10;
    static int num2 = 20;

    void method() {};
    static void staticMethod() {};

    // 정적 내부 클래스
    // 처음부터 접근 가능한 클래스
    static class Inner {
        void innerMethod() {
            /* - 외부 클래스의 인스턴스 변수, 인스턴스 메서드 접근 불가
            num1 = 20;
            method();
             */
            // 정적 변수와 정적 메서드 접근 가능
            num2 = 30;
            staticMethod();
        }
    }
}
