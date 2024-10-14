package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2024,2,30);
        s1.printThis(); // exam02.Schedule2@3b07d329 전체 클래스명@주소(16진수)
        System.out.println(s1); // 위와 값이 같음 = 주소가 같음
        System.out.println(s1 == s1.getThis());
        System.out.println("s1 : " + System.identityHashCode(s1));
        Schedule2 _this = s1.getThis();
        System.out.println("this : " + System.identityHashCode(_this));
    }
}
