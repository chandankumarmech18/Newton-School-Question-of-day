import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
          while (n > 0) {
            int t = n % 10;
            n = n / 10;

            temp = temp + t*100 +t*10+t;
          }

        System.out.println(result);
    }
}