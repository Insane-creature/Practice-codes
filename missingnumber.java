import java.util.*;
public class missingnumber {
    public static void main(String[] args){
        int[] array = {1,2,3,5};
        int n = array.length;

        Arrays.sort(array);
    for(int i = 0; i<n; i++){
        if(array[i] != i+1){
            System.out.println(i+1);
        }
    }
    
    }
    
}
