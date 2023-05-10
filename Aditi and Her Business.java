import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int maxLength = 1; // Minimum length of non-decreasing subsegment is 1
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (sequence[i] >= sequence[i - 1]) {
                // The current element is greater than or equal to the previous element
                currentLength++;
            } else {
                // The current element is smaller than the previous element
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; // Reset the current length
            }
        }

        // Check if the current non-decreasing subsegment extends to the end of the sequence
        maxLength = Math.max(maxLength, currentLength);

        System.out.println(maxLength);
    }
}