package exam01;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream(("a.txt"))) {

            /*
            Closeable closeable2 = fis;
            AutoCloseable closeable = fis;
             */
            // closeable.close();
            System.out.println(fis instanceof AutoCloseable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}