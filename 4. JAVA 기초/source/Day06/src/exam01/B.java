package exam01;

public class B extends A {
    int numB = 20;

    public B() {
        super(); // 컴파일러 자동 추가 - A();
        System.out.println("B클래스의 생성자");
    }

    /*
    위와 아래의 코드는 같음.
    물론 아래 코드는 함수 안에 함수를 정의할 수 없기 때문에 오류가 남

    public B() {
        public A() {
            System.out.println("A클래스의 생성자");
        }
        System.out.println("B클래스의 생성자");
    }
     */
}
