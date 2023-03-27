import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long temp = 1000;

        while(temp-1<n){
            ans+=n-temp+1;
            temp*=1000;
            
        }

        System.out.print(ans);
    }
}