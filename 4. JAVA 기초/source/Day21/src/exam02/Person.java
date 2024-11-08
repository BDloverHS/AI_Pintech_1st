package exam02;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("name=%s, age=%s%n", name, age);
    }
}
