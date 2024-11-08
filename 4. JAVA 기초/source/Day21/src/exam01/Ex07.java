package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');

            // 저장 값 : HUX8�.
            // 1바이트를 할당한다고 했지만 한글은 2~3 바이트를 차지하기 때문.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
