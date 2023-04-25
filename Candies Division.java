import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        int sum = 0;
        
        // read in the weights of the candies and calculate the total weight
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            sum += candies[i];
        }
        
        // if the total weight is odd, there is no way to divide the candies evenly
        if (sum % 2 != 0) {
            System.out.println("No");
            return;
        }
        
        // try to find a subset of candies that adds up to half the total weight
        boolean[][] dp = new boolean[n+1][sum/2+1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum/2; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= candies[i-1]) {
                    dp[i][j] |= dp[i-1][j-candies[i-1]];
                }
            }
        }
        if (dp[n][sum/2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}