import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
          Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long k = n;
        long sum = 0;
        while (k > 0){
            sum += k % 10;
            k = k / 10;
        }
        if(n%sum==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}