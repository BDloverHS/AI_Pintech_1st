package Quiz;

public class Ex04 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i+=2) {
            for (int j=1; j<=9; j++) {
                System.out.println(i+" × "+j+" = "+i * j);
            }
            System.out.println("----------------------------");
        }
    }
}
