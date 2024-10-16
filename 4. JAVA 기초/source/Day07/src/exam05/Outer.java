package exam05;

// 외부 클래스
public class Outer {

    // 인스턴스 변수/인스턴스 자원
    int num1 = 10;

    // 내부 클래스
    class Inner {
        // 15버전 이전까지는 오류가 남 (= 16버전부터는 가능)
        static int num;

        // Inner 클래스의 지역변수
        // Outer보다 우선순위
        int num1 = 20;

        void method() {
            // 내부 클래스에서도 접근 가능
            System.out.printf("내부 클래스에서의 num1의 값 : %d%n",num1);
            // 만약 Outer에 있는 자원을 쓰고 싶다면? -> this를 통해 사용 가능
            System.out.printf("외부 클래스에서의 num1의 값 : %d%n",Outer.this.num1);
        }
    }
}