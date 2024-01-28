package DailyCode;
public class subarraysum {
    public static void main(String[] args){
        int count = 0;
        int[] nums = {1,1,1};
        int k = 2;
      
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
      
        for (int start = 0; start < sum.length; start++) {
            for (int end = start + 1; end < sum.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
      
        System.out.println(count);
    }
}
