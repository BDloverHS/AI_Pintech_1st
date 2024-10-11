package Quiz;

public class Ex02 {
    public static void main(String[] args) {
        int room = 0;

        for (int i=1; i <= 40; i++) {
            System.out.println("학생"+i+", 방 번호 : "+room+"번");
            if (i % 4 == 0) {
                room++;
                System.out.println(" ");
            }
        }
    }
}
