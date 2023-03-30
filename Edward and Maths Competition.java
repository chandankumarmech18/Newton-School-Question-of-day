import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int evenCounter = 0; // Counter for the number of even numbers between 1 and N
        int oddCounter = 0; // Counter for the number of odd numbers between 1 and N
    
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) { // Check if the number is even
            evenCounter++;
        } else { // If the number is not even, it is odd
            oddCounter++;
        }
    }
    
    // The number of ways to choose a pair of an even and odd number is the product of the number of even and odd numbers
    int result = evenCounter * oddCounter;
    
    System.out.println(result);
    }
}