package exam02;

public class Ex02 {
    public static void main(String[] args) {
        // class 이름으로 함수 이름이
        Student s1 =  new Student(); // 생성자 메서드(함수)
        s1.ShowInfo();

        s1.id = 2000;
        s1.name = "김학생";
        s1.major = "자바";
        s1.ShowInfo();
    }
}
