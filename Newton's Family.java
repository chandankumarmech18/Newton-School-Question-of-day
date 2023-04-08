import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] children = new int[N];
        for (int i = 1; i < N; i++) {
            int parent = sc.nextInt();
            children[parent - 1]++;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(children[i]);
        }
    }
}