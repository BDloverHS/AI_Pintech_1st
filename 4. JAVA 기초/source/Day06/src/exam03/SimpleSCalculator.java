package exam03;

public class SimpleSCalculator extends Calculator {

    public SimpleSCalculator() {
        super();
    }

    // @ : 어노테이션. 컴파일러에게 특정한 정보를 제공해 주는 역할
    // @Override 재정의된 메서드라는 정보 제공
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
