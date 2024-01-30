package InterviewPrep1.Array;

public class removeduplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] nums1 = new int[0];
        int k = 0;
        int total = 0;
        for(int i = 0; i < nums.length - 1; i++){ // 1
            for(int j = i+1; j < nums.length - i; j++){ // 2
                if(nums[i] == nums[j]){ // 1 == 2
                    k = k+1;
                }
            }
        }
        total = nums.length - k;
        System.out.println(total);
        for(int i = 0; i < nums1.length; i++){ // 1
            System.out.println(nums1[i]);
        }
    }
}
