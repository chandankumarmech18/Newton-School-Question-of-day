import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M;
        int[] A;

        // Read input
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        // Calculate the total number of days required to visit all the places
        int totalDays = 0;
        for (int i = 0; i < M; i++) {
            totalDays += A[i];
        }

        // Check if it is possible to visit all the places and hang out
        if (totalDays > N) {
            System.out.println(-1);
        } else {
            System.out.println(N - totalDays);
        }
    }
}