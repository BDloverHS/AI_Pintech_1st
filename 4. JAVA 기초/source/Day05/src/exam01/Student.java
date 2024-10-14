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
}
