package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        // c의 주소를 ac에 대입
        A ac = c;
        // 위 코드를 한 줄로 줄임.
        A a = new C();
        B b = new C();

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(ac));

        // C클래스의 주소를 복사했으나 범위는 A로 한정
        System.out.println(ac.numA);


    }
}
