package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // 구구단
        for (int i=2; i<=9; i++) {
            // 형식화 미사용
            // for (int j=1; j<=9; j++) {
            //    System.out.println(i + " × " + j + " ＝ " + i * j);
            // }
            System.out.printf("--- %d단 ---%n", i);
            for (int j=1; j<=9; j++) {
                System.out.printf("%d × %d = %d%n", i, j, i * j);
            }
        }
    }
}
