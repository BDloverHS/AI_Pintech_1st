package exam02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        /*
        StringBuffer sb2 = sb.append("ABC");
        StringBuffer sb3 = sb2.append("DEF");
        StringBuffer sb4 = sb3.append("GHI");
        String str = sb4.toString();
        */

        // 메서드 체인
        String str = sb.append("ABC")
                       .append("DEF")
                       .append("GHI")
                       .toString();

        // System.out.println(sb==sb4);
        System.out.println(str);
    }
}
