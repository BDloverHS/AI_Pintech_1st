package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립보행");
    }

    /*
    @Override
    public void move() {
        // super.move(); // Animal의 move();
        System.out.println("두 발로 직립보행");
    }
     */
}