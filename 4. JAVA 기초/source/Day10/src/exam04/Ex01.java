package exam04;

public class Ex01 {
    public static void main(String[] args) {
        // Box<Apple> appleBox = new Box<Apple>(); // 타입을 Apple로 명시
        Box<Apple> appleBox = new Box<>(); // 위 코드를 아래처럼 생략 가능
        appleBox.setItem(new Apple());
        Apple apple = appleBox.getItem();
        System.out.println(apple.info());

        // Box<Grape> grapeBox = new Box<Grape>(); // 타입을 Grape로 명시
        Box<Grape> grapeBox = new Box<>(); // 위 코드를 아래처럼 생략 가능
        grapeBox.setItem(new Grape());
        Grape grape = grapeBox.getItem();
        System.out.println(grape.info());
    }
}
