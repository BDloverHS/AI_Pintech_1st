package exam03;

public class Ex04 {
    public static void main(String[] args) {
        // 1~100까지 더하는 for문
        int total = 0;
        for (int i=1; i<=100; i++) {
            if (i % 2 == 0) {
                continue; // 현재 반복 중단, 새로 반복 시작 - 건너뛰기
            }
            total += i;
        }
        System.out.println(total);
    }
}
