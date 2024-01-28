package DailyCode;
public class wavearray {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int n = a.length;
        for(int i = 0; i < n-1;i= i+2){
            if(a[i+1]>a[i]){    // 2 > 1
                int temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
            }// 2 1 3 4 5
        }
        for(int i = 0; i < n;i++){
            System.out.println(a[i]);

        }
    }
}
