package exam03;

public class Ex01 {
    public static void main(String[] args) {
        // Calculator cal = new C();
        Calculator cal = new SimpleSCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(cal.num);
    }
}
