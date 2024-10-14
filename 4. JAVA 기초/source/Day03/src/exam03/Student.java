package exam03;

public class Student {
    // class는 객체가 아님!!
    // class는 객체를 만들기 위한 설계도일 뿐!

    // Student의 속성
    int id; // 학번
    String name; // 이름
    String major; // 전공

    // Student의 행위
    void study() {
        System.out.printf("%s 학생의 학번은 %d이고 %s를 공부한다.", name, id, major);
    }
}