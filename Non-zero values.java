import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read n and m
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Initialize the counter
            int counter = 0;

            // Read the array elements and update the counter
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    if (x != 0) {
                        counter++;
                    }
                }
            }

            // Print the counter
            System.out.println(counter);
        }
    }
}