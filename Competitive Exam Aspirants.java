import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int U = sc.nextInt(); // Upper limit of age for exam
        int L = sc.nextInt(); // Lower limit of age for exam
        int X = sc.nextInt(); // Age of candidate


        if (X >= L && X <= U) {
            System.out.println("Yes");
        } 
        else {
            System.out.println("No");
        }

    }
}