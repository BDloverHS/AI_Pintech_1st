package exam01;

public class Q3 {
    public static void main(String[] args) {
        // 3. 건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때
        // 이를 swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)
        // 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽입니다.

        // 내 코드
        int floor = 6;
        switch(floor) {
            case 1 : System.out.println(floor+"층은 약국입니다."); break;
            case 2 : System.out.println(floor+"층은 정형외과입니다."); break;
            case 3 : System.out.println(floor+"층은 피부과입니다."); break;
            case 4 : System.out.println(floor+"층은 치과입니다."); break;
            case 5 : System.out.println(floor+"층은 헬스클럽입니다."); break;
            default : System.out.println(floor+"층은 없습니다.");
        }
        
        // 강사님 코드
        int Tfloor = 3;
        switch (Tfloor) {
            case 1 : System.out.println("1층 약국"); break;
            case 2 : System.out.println("2층 정형외과"); break;
            case 3 : System.out.println("3층 피부과"); break;
            case 4 : System.out.println("4층 치과"); break;
            case 5 : System.out.println("5층 헬스클럽"); break;
            default: System.out.println("접근할 수 없는 층입니다.");
        }
    }
}
