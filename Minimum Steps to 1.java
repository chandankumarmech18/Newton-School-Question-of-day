import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (n != 1) {
            if (n % 6 == 0) {
                n /= 6;
                count++;
            } else if (n % 3 == 0) {
                n *= 2;
                count++;
            } else {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(count);
    
    }
}