package exam01;

public class C extends B {
    int numC = 30;
    
    public C() {
        // 정의하지 않아도 항상 첫 줄에 먼저 추가됨.
        // 컴파일러 자동 추가
        super(); // - B();
        System.out.println("C클래스의 생성자");
    }
}