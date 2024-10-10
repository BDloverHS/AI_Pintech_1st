package exam02;

public class Ex04 {

    static int[] nums2 = new int[4];
    public static void main(String[] args) {
        // int[] nums = new int[] {10, 20, 30, 40}; // 선언과 동시에 초기화
        // int[] nums = {10, 20, 30, 40};
        // int[] nums;
        // nums = {10, 20, 30, 40};
        // int [] nums; // 공간만 할당받음. 값이 없음
        // System.out.println(nums2);
        // nums = new int[] {10, 20, 30, 40};

        int [] nums = {10,20,30,40,50,60,70};

        // length : 문자의 길이(배열 같은 경우 배열의 요소 수)
        // 배열의 개수는 n개이지만 index는 (n-1)개임을 인식해야 한다.
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.printf("배열 공간의 개수 : %d%n인덱스의 마지막 번호 : %d", nums.length, nums.length - 1);

        // foreach 문
        for (int num : nums) { // 향상된 for 문
            System.out.println(num);
        }
    }
}
