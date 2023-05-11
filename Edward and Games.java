import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int moves = findMoves(n, m);
        System.out.println(moves);
    }

    private static int findMoves(int n, int m) {
        if (m % n != 0) {
            return -1; // No solution exists
        }

        int moves = 0;
        int factor = m / n;

        while (factor % 2 == 0) {
            factor /= 2;
            moves++;
        }

        while (factor % 3 == 0) {
            factor /= 3;
            moves++;
        }

        return factor == 1 ? moves : -1;
    }
}