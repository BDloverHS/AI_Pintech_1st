package exam05;

import java.util.List;

public class Juicer {
    // 컴파일 시 FruitBox<> 안에 내용을 제거하면서 시그니쳐가 동일해지면서 충돌이 남.
    /*
    public static void make(FruitBox<Apple> appleBox) {
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }

    // 메서드 중복 정의, 정의 불가
    public static void make(FruitBox<Grape> grapeBox) {
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }
    */

    // 위와 같은 오류를 없애기 위해 와일드 카드 사용
    // ? - Apple, Grape, Fruit
    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    // Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(FruitBox<T> fruitBox) {

    }
}
