package DailyCode;
public class searchposition {
    public static void main(String[] args){
        int[] nums = {1,3,5,7};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                index = i;
                break;
            }  

        }
        if(index == 0){
            for(int j = 0; j<nums.length; j++){
                if(nums[j]>= target){
                    index = j;
                    break;
                }
                else{
                    index = nums.length;
                }
            }
        }
        
        return index;
        
    }
    
}
