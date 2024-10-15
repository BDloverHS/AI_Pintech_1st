package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(); // Tiger, Animal
        // == Animal tiger = new Tiger();
        tiger.move();

        Bird bird = new Bird(); // Bird, Animal
        // == Animal bird = new Bird();
        bird.move();

        Human human = new Human(); // Human, Animal
        // == Animal human = new Human();
        human.move();
    }
}
