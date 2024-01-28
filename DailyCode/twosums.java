package DailyCode;
public class twosums {
    public static void main(String[] args){
        int[] ar = {2,7,11,15};
        int n = ar.length;
        int target = 9;
        int total = 0;
        int[] result = new int[2];

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(ar[i] + ar[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(result[0] + " "+result[1]);
    }
    
}
