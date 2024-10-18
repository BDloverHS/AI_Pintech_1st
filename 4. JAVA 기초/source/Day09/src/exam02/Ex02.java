package exam02;

public class Ex02 {
    public static void main(String[] args) {
        // 주소값이 계속 바뀜
        String str = "ABC";
        System.out.println(System.identityHashCode(str));
        str += "DEF";
        System.out.println(System.identityHashCode(str));
        str += "GHI";
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
    }
}
