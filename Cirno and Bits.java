import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("3");
        } else if (userInput % 2 == 1) {
            System.out.println("1");
        } else {
            int result = 1;
            while (userInput % 2 == 0) {
                userInput /= 2;
                result *= 2;
            }
            boolean temp = userInput == 1;
            System.out.println(result + (temp ? 1 : 0));
        }

    }
}