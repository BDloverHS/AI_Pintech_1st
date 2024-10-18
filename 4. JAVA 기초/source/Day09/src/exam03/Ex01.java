package exam03;

public class Ex01 {
    public static void main(String[] args) {
        // 'Integer(int)'은(는) 버전 9 이상에서 지원 중단되며 제거될 예정입니다.
        // 라는 메세지가 뜨지만 실행에는 문제없음.
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);

        // 연산은 기본 자료형만 된다!, 같은 자료형의 기본 자료형만 된다!

        // 객체 간의 연산 불가인데 왜 연산이 가능한거지?
        int num3 = num1 + num2;
        /**
         * 그 이유는 컴파일러가 자동으로 num1과 num2 뒤에 .intValue()를 붙여 int 자료형으로
         * 형변환을 해주었기 때문이다.
         *
         * .intValue() - 언박싱 : 기본 자료형을 객체엇 꺼내기
         */
        System.out.println(num3);

        Character ch1 = new Character('A');
        Character ch2 = new Character('B');
        Character ch3 = (char) (ch1 + ch2);
        System.out.println(ch3);


    }
}
