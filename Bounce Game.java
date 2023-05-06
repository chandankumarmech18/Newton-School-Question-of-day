import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n+1];
        for (int i = 1; i <= n; i++) {
            l[i] = sc.nextInt();
        }

        int answer = 0;
        int d = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (i == 1) {
                d = 0;
            } else {
                d = d + l[i-1];
            }
            if (d <= x) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}