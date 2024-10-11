package exam02;

// exam02.Student : 전체 클래스명
public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    /**
     * 따로 정의하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
     * 객체를 생성하기 위함(객체를 생성하는 기능을 가짐)
     */

    // 컴파일러가 추가해줌(기본 생성자, 디폴트 생성자라고도 함)
    public Student() {
        // 객체 생성 이후 실행
        // 객체의 변수의 초기화
        id = 1000;
        name = "이학생";
        major = "수학";
    }

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    void ShowInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
