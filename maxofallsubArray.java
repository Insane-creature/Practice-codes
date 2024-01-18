import java.util.ArrayList;

public class maxofallsubArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        
        int maxi=0;
        
        for(int i=0;i<=n-k;i++){
            maxi=0;
            for(int j=i;j<k+i;j++){
               maxi = Math.max(maxi,arr[j]);
            }
            list.add(maxi);
        }
        for(int i=0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
}
