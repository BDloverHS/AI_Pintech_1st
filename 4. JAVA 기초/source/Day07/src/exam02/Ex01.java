package exam02;

public class Ex01 {
    public static void main(String[] args) {
        // SimpleCalculator cal = new SimpleCalculator();
        // 다형성을 적용시킴
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
