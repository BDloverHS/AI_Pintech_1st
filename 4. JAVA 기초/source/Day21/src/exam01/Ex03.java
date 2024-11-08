package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int value = fis.read(buffer);
                /*
                System.out.printf("읽어본 바이트 : %d%n", value);
                for (int i = 0; i < buffer.length; i++) {
                    System.out.print((char)buffer[i]);
                }
                */
                for (int i = 0; i < value; i++) {
                    System.out.print((char)buffer[i]);
                }

                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 위 코드의 출력값은
 * ABCDE
 * FGHIJ
 * ...
 * UVWXY
 * ZVWXY
 *
 * 인데, 버퍼를 비우는 것도 일이기 때문에 기존 버퍼를 덮어씌우는 것이다.
 *
 * 처음에는 [] 상태에서 [A,B,C,D,E]로 덮어씌워졌고,
 * [A, B, C, D, E]에서 A가 F로, B가 G로...(생략)
 */