package Quiz;

public class Ex03 {
    public static void main(String[] args) {

        int floor = 6;

        switch(floor) {
            case 1 : System.out.println(floor+"층은 약국입니다."); break;
            case 2 : System.out.println(floor+"층은 정형외과입니다."); break;
            case 3 : System.out.println(floor+"층은 피부과입니다."); break;
            case 4 : System.out.println(floor+"층은 치과입니다."); break;
            case 5 : System.out.println(floor+"층은 헬스클럽입니다."); break;
            default : System.out.println(floor+"층은 없습니다.");
        }
    }
}
