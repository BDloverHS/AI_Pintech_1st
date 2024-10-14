package exam04;

// import exam03.A;
// import exam03.B;
// import exam03.*; -> exam03에 포함된 모든 클래스를 임포트 시킴

import exam03.A;
import exam03.B;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A(); // exam03 안에 있는 A 클래스 사용
        B b = new B(); // exam03 안에 있는 B 클래스 사용
        // a.num1; -> 접근 불가(default이기 때문에)
        a.num2 = 20;

    }
}
