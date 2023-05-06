import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] degree = new int[n+1]; // degree array

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            degree[a]++; // increment degree of vertex a
            degree[b]++; // increment degree of vertex b
        }

        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}