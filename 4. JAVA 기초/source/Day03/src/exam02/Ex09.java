package exam02;

public class Ex09 {
    public static void main(String[] args) {
        /*
        int [][] nums = new int[][]{
                {10,20,30},
                {40,50,60}
        };
         */

        int [][] nums = {{10,20,30}, {40,50,60,70}};
        System.out.printf("nums.length=%d%n", nums.length);
        System.out.printf("nums[0].length=%d%n", nums[0].length);

        int[] nums1 = nums[0];
        nums1[1] = 22;

        System.out.println(nums1);

        for (int i=0; i<nums.length; i++) {
            for(int j=0; j < nums[i].length; j++) {
                System.out.printf("%d행, %d열 = %d%n", i, j, nums[i][j]);
            }
        }
    }
}