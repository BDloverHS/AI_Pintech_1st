package exam05;

import exam05.Grape;

public class Ex01 {
    public static void main(String[] args) {

        // <? extend> 예시
        // FruitBox<Apple> appleBox = new FruitBox<>(); // Apple, Fruit
        FruitBox<Fruit> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make((FruitBox<? extends Fruit>) appleBox); // 사과 주스

        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make(grapeBox); // 포도 주스

        FruitBox<Toy> toyBox = new FruitBox<>();
        //Juicer.make(toyBox);
    }
}
