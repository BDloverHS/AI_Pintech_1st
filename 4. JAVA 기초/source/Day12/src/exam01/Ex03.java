package exam01;

public class Ex03 {
    public static void main(String[] args) {
        // MyLambda my = (s) -> System.out.println(s);
        // MyLambda my2 = s -> System.out.println(s);

        MyLambda my3 = () -> System.out.println("출력");
        my3.print();
    }
}
//