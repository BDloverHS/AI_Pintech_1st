package exam01;

import java.util.Stack;

public class Ex02 {
    public static void main(String[] args) {
        Stack<String> items = new Stack<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");
        items.add("항목6");

        while(items.size() > 0) {
            String item = items.pop();
            System.out.println(item);
        }
    }
}
