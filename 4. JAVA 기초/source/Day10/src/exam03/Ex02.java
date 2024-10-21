package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Grape()); // 사과만 담으려고 만든 박스인데 포도를 넣음

        Object _apple = appleBox.getItem(); // 타입 안정성이 떨어짐
        if (_apple instanceof Apple) {
            Apple apple = (Apple)_apple;
        }
        // System.out.println(apple.info());
    }
}
