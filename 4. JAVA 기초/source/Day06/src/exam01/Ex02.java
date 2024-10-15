package exam01;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();

        // B는 A에게 상속받고, C는 B에게 상속받아서
        // B에 있는 A의 자원까지 C에서 사용 가능
        System.out.println(c.numA);
        System.out.println(c.numB);
        System.out.println(c.numC);
    }
}
