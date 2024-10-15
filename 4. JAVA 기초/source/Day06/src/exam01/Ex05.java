package exam01;

public class Ex05 {
    public static void main(String[] args) {
        A ac = new C(); // 출처가 C 클래스 객체
        A ad = new D(); // 출처가 D 클래스 객체
        // 둘의 주소는 서로 다름
        System.out.println(ac == ad);

        // 문제 발생 가능성 때문에 오류가 남
        // C c1 = ad;

        // 상위 클래스 자료형 -> 하위 클래스 자료형(명시적 형변환)
        // 문제가 생길 것을 각오하고 형변환 시도
        // 하지만 출처가 다르기 때문에 형변환을 했음에도 오류가 남
        // C c1 = (C)ad;

        if (ad instanceof C) {
            C c1 = (C)ad;
            System.out.println("유입1");
        }

        if (ac instanceof C) {
            C c2 = (C)ac;
            System.out.println("유입2");
        }

        if (ac instanceof C c) { // 출처 체크하고 이상 없으면 C로 형변환
            System.out.println(c.numC);
        }
    }
}
