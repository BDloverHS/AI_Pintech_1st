package exam03;

public class Ex01 {
    public static void main(String[] args) {

        // 실체화가 되어 메모리가 할당됨
        // 실체화가 되었으니 인스턴스
        Student s1 = new Student();

        // 클래스 내 변수에 접근함.
        s1.id = 1000; // 인스턴스 변수
        s1.name = "김학생"; // 인스턴스 변수
        s1.major = "자바"; // 인스턴스 변수
        s1.study(); // 인스턴스 메서드
    }
}
