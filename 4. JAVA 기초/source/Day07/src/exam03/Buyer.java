package exam03;

// interface는 추상 메서드만 정의
public interface Buyer {

    // 안 보이지만 public static final이 붙어있음.
    // 정적 상수이기 때문에 변수명은 대문자로.
    // public static은 지워도 된다.(컴파일러가 자동으로 추가하기 때문.)
    public static int Num = 10;


    void buy();
    // default를 붙이면 인스턴스 메서드를 구현할 수 있다.
    default void order() {
        System.out.println("Buyer - 주문!");
    }

    private void privateMehthod() {
        System.out.println("private 메서드");
    }

    static void staticMethod() {
        System.out.println("정적 메서드");
    }
}
