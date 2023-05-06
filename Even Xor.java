import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = n ^ 2;
       
        if(n == x){
            n += 2;
        }
        else if ((n/2)%2==0){
            n += 2;
        }
        
        else{
            n -= 2;
        }
        System.out.println(n);
    }
}