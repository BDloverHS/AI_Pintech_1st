package exam01;

public class Ex01 {
    /**
     * 설명 전용 주석
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
            이렇게 하면
            여러 줄을 주석 처리
            가능하지.
        */
        int num1; // 변수 선언
        num1 = 10; // 초기화 : 최초로 값을 저장하는 것. = 대입 연산자
        // System.out.println(num1); 자바 코드를 주석 처리하면 해석이 되지 않으므로 실행 배제

        int num2 = 20; // 선언과 동시에 초기화
        System.out.println(num1+num2);
    }
}
