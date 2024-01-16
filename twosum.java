import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;

class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int i=0, j = nums.length-1;
        Map<Integer, Integer> numsToIndex= new HashMap();

        for(int k=0;k<nums.length;k++){
            if(numsToIndex.containsKey(nums[k])){
                if(nums[k]*2==target){
                    return new int[]{k,numsToIndex.get(nums[k])};
                }
            }
            numsToIndex.put(nums[k], k);
        }
        Arrays.sort(nums);
        int[] result = new int[2];
        if(nums.length==2){
            return new int[]{0,1};
        }
        else {
            while(i<j){
                if(nums[i]+nums[j]==target){
                result[0] = numsToIndex.get(nums[i]);
                result[1] = numsToIndex.get(nums[j]); 
                return result;
                }
                else if(nums[i]+nums[j]<target){
                    i++;
                }
                else if(nums[i]+nums[j]>target){
                    j--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }
}