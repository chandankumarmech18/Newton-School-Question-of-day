import java.util.*;

public class Main {
    public static int minAbsDiff(int[] weights) {
        int n = weights.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = weights[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + weights[i];
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int s1 = prefixSum[i];
            int s2 = prefixSum[n - 1] - prefixSum[i];
            minDiff = Math.min(minDiff, Math.abs(s1 - s2));
        }
        return minDiff;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = minAbsDiff(arr);
        System.out.println(ans);
    }
}