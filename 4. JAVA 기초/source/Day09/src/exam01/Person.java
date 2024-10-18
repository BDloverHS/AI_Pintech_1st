package exam01;

public class Person {
    private int age;
    private String name;

    // Person 메서드를 만들었기 때문에 기본 생성자가 생성되지 않으므로
    // 기본 생성자 생성
    public Person() {}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
               "age=" + age +
               ", name='" + name + '\'' +
               '}';
    }
}
