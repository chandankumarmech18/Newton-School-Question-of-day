
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] coins = new int[a+b];
        for (int i = 0; i < a; i++) {
            coins[i] = 1;
        }
        for (int i = a; i < a+b; i++) {
            coins[i] = 2;
        }
        Arrays.sort(coins);
        int sum = 1;
        for (int i = 0; i < a+b; i++) {
            if (coins[i] > sum + 1) {
                System.out.println(sum + 1);
                return;
            }
            sum += coins[i];
        }
        System.out.println(sum);
    }
}