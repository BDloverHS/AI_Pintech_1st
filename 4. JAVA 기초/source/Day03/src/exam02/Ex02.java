package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int 자료형 변수 4개 생성
        // 위 배열은 자료형 변수 4개를 생성하기 때문에 16바이트(int 당 4바이트. 4 * 4) 생성
        // 자료(데이터)가 서로 붙어있는 연속적인 구조
        // 다른 자료형이 오면 길이 계산이 힘들기 때문에 모두 같은 자료형이 온다.
        System.out.println(nums); //출력시 나오는 것 : 배열 시작 지점 주소


        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        /*
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
         */
        for (int i=0; i<=3; i++) {
            System.out.println(nums[i]);
        }
    }
}