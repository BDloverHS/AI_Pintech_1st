package exam02;

public class Ex01 {
    public static void main(String[] args) {
        // 지역 변수(참조 변수 / 스택 영역 메모리에 있음)
        Student s1 = new Student();
        // id, name, major는 힙 영역 메모리에 존재
        s1.id = 1000;
        s1.name = "이학생";
        s1.major = "수학";
        s1.ShowInfo();

        // s1의 주소(가상)
        System.out.println("s1 : " + System.identityHashCode(s1));

        // 주소 연결이 끊겨서 자료에 접근 할 수가 없다.
        s1 = null;

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "박이름";
        s2.major = "영어";
        s2.ShowInfo();

        // s2의 주소(가상)
        System.out.println("s2 : " + System.identityHashCode(s2));

        // s3은 s2의 주소를 복사한 것이다.
        Student s3 = s2;
        System.out.println("s3 : " + System.identityHashCode(s3));
        s3.ShowInfo();
        s3.name = "(수정)박이름";
        // 주소가 같으므로 하나를 수정하면 나머지 하나도 자동으로 바뀜
        // 즉, 같은 자료를 공유함.
        s3.ShowInfo();
        s2.ShowInfo();

        // 주소 비교.
        System.out.println("s1, s2 주소 : " + (s1 == s2));
        System.out.println("s2, s3 주소 : " + (s2 == s3));
    }
}
