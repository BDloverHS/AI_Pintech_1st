package exam01;

import java.util.ArrayList;

public class Ex01{
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        /*
        순서가 바뀌기 때문에 배열 몇개가 남음
        for (int i=0; i < items.size(); i++) {
            items.remove(i);
        }
        */

        // 뒤에서부터 지우면서 순서에 영향이 없도록
        for (int i=items.size() - 1; i >= 0; i--) {
            String item = items.remove(i);
            System.out.printf("꺼낸 요소 : %s%n", item);
        }

        for (int i=0; i < items.size(); i++) {
            String item = items.get(i);
            System.out.println(item);
        }
    }
}
