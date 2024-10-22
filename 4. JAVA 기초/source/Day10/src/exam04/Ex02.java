package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        System.out.println(box); // box.toString()

        // 오류 메세지 : 타입 매개변수 'exam04.Toy'이(가) 해당 바운드 내에 없으며, 'exam04.Fruit'을(를) 확장해야 합니다
        // Box<Toy> toyBox = new Box<>();

    }
}
