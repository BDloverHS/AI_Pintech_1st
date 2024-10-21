package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box applebox = new Box();
        applebox.setItem(new Apple());

        Apple apple = (Apple)applebox.getItem(); // 형변환의 번거로움
        System.out.println(apple.info());

        Box grapebox = new Box();
        grapebox.setItem(new Grape());

        Grape grape = (Grape) grapebox.getItem(); // 형변환의 번거로움
        System.out.println(grape.info());
    }
}
