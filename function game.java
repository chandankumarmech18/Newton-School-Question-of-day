import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long f(long x){
        return x*x+2*x+3;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long t=sc.nextLong();
        long ans=f(f(f(t)+t)+f(f(t)));
        System.out.println(ans);
    }
}