package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student.id = 1000; // 정적 변수임을 바로 알 수가 있음. 클래스명.정적변수
        Class cls = Student.class; // class 클래스(클래스 로더가 만들어줌)
    }
}
