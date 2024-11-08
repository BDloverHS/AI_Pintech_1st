package exam01;

import java.io.File;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        // File dir = new File("D:/tmp"); // 경로가 실제로 있는지 체크, 없으면 생성

        // 단, 폴더를 여러 개 생성하면 오류가 남. 아래 코드는 오류 코드
        File dir = new File("D:/tmp/sub/sub2");

        if(!dir.exists()) { // 디렉토리가 없다면 디렉토리 생성
            // dir.mkdir(); 디렉토리 1개만 생성
            dir.mkdirs(); // 하위 디렉토리도 생성
        }

        File file = new File("D:/tmp/test.txt");

        file.createNewFile();
    }
}
