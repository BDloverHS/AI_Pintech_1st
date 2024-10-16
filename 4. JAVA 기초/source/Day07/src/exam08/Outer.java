package exam08;

import exam02.Calculator;

public class Outer {
    Calculator method(int num3) {

        // 익명 내부 클래스 - 직접 리턴을 통해 공간 절약 가능
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                // num3 = 20; -> 오류가 나는 이유 : num3이 상수가 되었기 때문에.
                // 상수가 된 이유 : 접근해야 할 메서드 존재(제거되면 안 됨)
                // 지역변수의 상수화 : 제거되지 않고 유지하기 위해서
                return num1 + num2 + num3;
            }
        };

        /*
        // 힙에 할당되어 있음
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        return cal;
        */

        /*
        int result = cal.add(10,20);
        System.out.printf("cal.add()의 결과값 : %s",result);
         */
    }
}
