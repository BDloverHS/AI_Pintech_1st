package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            int ch = fis.read(); // 1바이트 읽기
            System.out.println((char)ch); // 1바이트 문자열로 형변환

            ch = fis.read(); // 1바이트 A를 읽었으므로 다음 위치인 B로 이동
            System.out.println((char)ch); // 1바이트 문자열로 형변환

            ch = fis.read(); // 1바이트 B를 읽었으므로 다음 위치인 C로 이동
            System.out.println((char)ch); // 1바이트 문자열로 형변환

            ch = fis.read(); // 1바이트 C를 읽었으므로 다음 위치인 D로 이동
            System.out.println((char)ch); // 1바이트 문자열로 형변환

            ch = fis.read(); // 1바이트 D를 읽은 후엔 읽을 게 없으므로 -1이 저장되며 다 읽었음을 알 수 있음.
            System.out.println((char)ch); // 1바이트 문자열로 형변환

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
