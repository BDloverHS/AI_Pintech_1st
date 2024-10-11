package exam02;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        // 주소를 대입함.
        int[] nums2 = nums1;
        
        // 주소값 출력
        System.out.println(nums1);
        System.out.println(nums2);
        
        // 주소가 같기 때문에 데이터 출력값도 같음.
        System.out.println(nums1[1]);
        System.out.println(nums2[1]);

        nums2[1] = 22;

        System.out.println(nums2);

        // 값만 가져오고 싶을 때
        int [] nums3 = nums1.clone();

    }
}