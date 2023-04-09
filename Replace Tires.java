import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();

        if (n%2==1||n<4){
            System.out.println(-1);
        }
        
        else{
            n /= 2;
            System.out.println((n+2)/3 +" "+n/2);
            
        }
    }
}