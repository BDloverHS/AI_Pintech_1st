package exam01;

public class Student {
    public static void main(String[] args) {

    }

    // 아직 변수가 아님. 객체를 만들면 이러한 변수를 만들겠다고 정의한 것.
    static int id; // 학번
    String name;
    String major;

    // 눈에 보이지 않지만 자연적으로 생김
    public Student() {}

    void ShowInfo() {
        System.out.printf("id=%d, name=%s, major:%s%n", id, name, major);
    }

    static void staticMethod() {
        // 객체를 생성하지 않기 때문에 this라는 지역 변수가 존재하지 않는다.
        System.out.println("정적 메서드!");
        // this.name = "이이름"; // 불가능
        id = 1000; // id는 정적 변수이기 때문에 사용 가능하다.

        // this.showInfo() -> 접근 불가
        // showInfo() -> 접근 불가
        staticMethod2(); // 정적 메서드이기 때문에 사용 가능
    }

    static void staticMethod2() {

    }
}
