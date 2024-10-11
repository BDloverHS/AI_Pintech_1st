package exam02;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    /**
     * 따로 정의하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
     * 객체를 생성하기 위함(객체를 생성하는 기능을 가짐)
     */
    public Student() {}

    void ShowInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
