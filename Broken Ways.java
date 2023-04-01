import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// import java.util.Scanner;
// import java.util.HashSet;

public class Main {
    static int mod = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> brokenSteps = new HashSet<>();
        for (int i = 0; i < m; i++) {
            brokenSteps.add(sc.nextInt());
        }
        long[] dp = new long[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (brokenSteps.contains(i)) {
                dp[i] = 0;
            } else {
                dp[i] = (dp[i-1] + dp[i-2]) % mod;
            }
        }
        System.out.println(dp[n]);
    }
}