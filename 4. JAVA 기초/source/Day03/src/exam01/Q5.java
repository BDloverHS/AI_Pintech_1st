package exam01;

public class Q5 {
    public static void main(String[] args) {
        // 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는
        // 프로그램을 만들어 보세요.구현 소스

        // 내 코드
        for (int i=1; i<10; i++) {
            for (int j=i; j<10; j++) {
                System.out.printf("%d × %d ＝ %d%n", i, j, i*j);
            }
            System.out.println();
        }

        // 강사님 코드 1
        for (int i = 2; i<=9; i++) {
            System.out.printf("--- %d단 ---%n", i);
            for (int j=1; j<=9; j++) {
                if (j >= i) {
                    System.out.printf("%d × %d ＝ %d%n", i, j, i * j);
                }
            }
            System.out.println();
        }

        // 강사님 코드 2
        for (int i = 2; i<=9; i++) {
            System.out.printf("--- %d단 ---%n", i);
            for (int j=1; j<=9; j++) {
                if (j < i) {continue;}
                System.out.printf("%d × %d ＝ %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
