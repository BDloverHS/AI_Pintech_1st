package exam04;

public class Ex01 {
    public static void main(String[] args) {
        // 이것들은 객체들임.
        Transportation Trans = Transportation.BUS;

        switch (Trans) {
            // case Transportation.BUS:
            case BUS : System.out.println("버스"); break;
            case SUBWAY : System.out.println("지하철"); break;
            case TAXI : System.out.println("택시"); break;
        }
    }
}
