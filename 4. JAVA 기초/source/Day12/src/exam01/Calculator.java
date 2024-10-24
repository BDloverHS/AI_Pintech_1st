package exam01;

// 어노테이션이 오류가 난다면 통제를 의미. 무언가 형식에 맞지 않음
@FunctionalInterface
public interface Calculator {
    int add(int num1, int num2);
    // int minus(int num1, int num2);
}
