package stack;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    public Student() {
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
