import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] parents = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            parents[i] = sc.nextInt();
        }
        int current = n;
        int count = 0;
        while (current != 1) {
            current = parents[current - 2];
            count++;
        }
        System.out.println(count);
    }
}