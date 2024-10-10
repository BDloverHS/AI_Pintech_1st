package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int age = 16;
        if (age < 8) {
            System.out.println("유치원");
        } else if (age < 14) {
            System.out.println("초등학생");
        } else if (age < 17) {
            System.out.println("중학생");
        } else if (age < 20) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
        int num = 10;
        // 간단한 조건식은 삼항조건연산 자료 대체
        String result = num == 10 ? "10입니다" : "10이 아닙니다";
        System.out.println(result);
    }
}
