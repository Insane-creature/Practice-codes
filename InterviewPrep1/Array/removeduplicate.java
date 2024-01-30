package InterviewPrep1.Array;

public class removeduplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];      // nums[1] = 1
                j++;                    // j = 2
            }
        }
        System.out.println(j);
        
    }
}
