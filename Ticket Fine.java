import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read the number of test cases
            int t = sc.nextInt();

            // Iterate over the test cases
            for (int i = 0; i < t; i++) {
                // Read the input values for this test case
                int x = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                
                // Calculate the number of passengers without a ticket
                int noTicket = p - q;

                // Calculate the total fine collected
                int fine = noTicket * x;

                // Print the total fine collected
                System.out.println(fine);
            }
        }
    }
}