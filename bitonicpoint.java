public class bitonicpoint {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n = arr.length;

        int maxi = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);

    }
}
