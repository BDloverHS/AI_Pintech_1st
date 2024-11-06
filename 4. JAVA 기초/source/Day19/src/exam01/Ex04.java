package exam01;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();

        // 랜덤으로 숫자 계속 뽑고 홀수면 출력 / 존재하지 않으면 0
        int odd = random.ints().filter(x -> x % 2 == 1).findFirst().orElse(0);

        System.out.println(odd);
    }
}
