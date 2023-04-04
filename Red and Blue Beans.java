import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long b = sc.nextLong();
        long d = sc.nextLong();

        if (r>b) {
            long temp = r;
            r=b;
            b=temp;

        }
        if(b>(r+d)*(d+1)){
            System.out.println("No");
        } 
        
        else {
            System.out.println("Yes");
        }
    }
    
}