import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int time = 21 * 60 + n;
        int hr = time/60;
        int min = time%60;
        System.out.format("%02d:%02d", hr, min);
    }
}