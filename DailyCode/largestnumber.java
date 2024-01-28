package DailyCode;
public class largestnumber{
    public static void main(String[] args){
        int[] ar= {1, 2, 30, 4, 5};
        int n = ar.length;
        
        int maxi = ar[0]; // = 1
        for(int i = 1; i<n;i++){
            if(maxi<ar[i]){         
                maxi = ar[i];
            }
        }
        System.out.println(maxi);


    }
}