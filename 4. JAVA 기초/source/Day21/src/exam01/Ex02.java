package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            // int ch;
            // while ((ch = fis.read()) != -1) { // 다 읽었을 때 -1 나오면 반복 중단
            while(fis.available() > 0) { // 스트림에서 읽을 수 있는(또는 건너뛸 수 있는) 추정값이 0보다 클 때 반복
                System.out.print((char)fis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
