package exam01;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C(); // C->B,A
        A a = c; // 단, A클래스의 자원만 사용 가능
        B b = c; // 단, 상위 클래스인 A와 본인인 B의 자원만 사용 가능
        System.out.println(a.numA);
        // 오류. 오버플로우가 되기 때문.
        // A에는 A에 할당되는 자원까지만 사용 가능
        // System.out.println(a.numC);

        System.out.println(a == c);
        System.out.println(b == c);

        System.out.printf("a는 C에서 유래되었는가?%s%n", a instanceof C);
        System.out.printf("b는 C에서 유래되었는가?%s%n", b instanceof C);
        System.out.printf("a는 B에서 유래되었는가?%s%n", a instanceof B);
        System.out.printf("a는 A에서 유래되었는가?%s%n", a instanceof A);
        // 전부 true 이유? a, b, c 주소는 다 동일, 유래도 동일
    }
}
