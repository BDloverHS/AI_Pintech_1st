package exam01;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(Transportation.BUS.getTitle());
        System.out.println(Transportation.SUBWAY.getTitle());
        System.out.println(Transportation.TAXI.getTitle());

        System.out.printf("버스 10명 : %s%n", Transportation.BUS.getTotal(10));
        System.out.printf("지하철 6명 : %s%n", Transportation.SUBWAY.getTotal(6));
        System.out.printf("택시 4명 : %s%n", Transportation.TAXI.getTotal(4));
    }
}
