package exam01;

// Transportation에 정의된 정적 자원 import
import static exam01.Transportation.*;

public class Ex01 {
    public static void main(String[] args) {
        System.out.printf("SUBWAY.name() : %s, SUBWAY.ordinal() : %s%n", SUBWAY.name(), SUBWAY.ordinal());
        System.out.printf("BUS.name() : %s, BUS.ordinal() : %s%n", BUS.name(), BUS.ordinal());
        System.out.printf("TAXI.name() : %s, TAXI.ordinal() : %s%n", TAXI.name(), TAXI.ordinal());

    }
}
