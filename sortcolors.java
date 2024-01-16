public class sortcolors {
    public static void main(String[] args){
        int[] nums = {2,1,2,1,1,0};
        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - 1; j++){
                int mini = nums[i];
                if(mini > nums[j+1]){
                    int temp = mini;
                    mini = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }


        for(int i = 0; i < n; i++){
            System.out.println(nums[i]);
        }



    }
}
