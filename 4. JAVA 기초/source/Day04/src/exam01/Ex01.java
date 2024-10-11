package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //  void : 반환 값이 없을 때 자료형
        //  return 예약어를 사용하지 않아도 됨.(자바 한정)
        int r = add(10, 20);
        System.out.println(r);
    }
    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
