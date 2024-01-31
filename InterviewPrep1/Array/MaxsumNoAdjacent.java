package InterviewPrep1.Array;

public class MaxsumNoAdjacent {
    public static int findMaxSum(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return arr[0];
        }
        // Initialize two variables to store the maximum sum considering
        // the current element included and excluded.
        int incl = arr[0];
        int excl = 0;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Calculate the current inclusive sum as the maximum of
            // (previous inclusive sum + current element) and previous exclusive sum
            int newIncl = Math.max(excl + arr[i], incl);    // 3 --> 

            // The current exclusive sum is the maximum of previous inclusive and exclusive sums
            excl = incl;    // 2

            // Update the inclusive sum for the next iteration
            incl = newIncl; //3
        }
        // The final result is the maximum of inclusive and exclusive sums
        return Math.max(incl, excl);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 7};
        int result = findMaxSum(arr);
        System.out.println("Maximum Sum with No Adjacent Elements: " + result);
    }
}
