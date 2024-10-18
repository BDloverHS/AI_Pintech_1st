package exam02;

public class Ex03 {
    public static void main(String[] args) {
        // Buffer : 임시 메모리
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        // 임시메모리 주소이기 때문에 모두 같다
        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(str);
        System.out.println("str 주소 : " + System.identityHashCode(str));

        String str2 = "ABCDEFGHI";
        System.out.println("str2 주소 : " +  System.identityHashCode(str2));

        System.out.printf("str == str2 : %s%n", str == str2); // 지양 - 동일성
        System.out.printf("str.equals(str2) : %s%n", str.equals(str2)); // 바람직 - 동등성
    }
}
