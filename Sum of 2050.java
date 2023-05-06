import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();

        if(n%2050!=0) {
            System.out.println("-1");
        } 
        else{
            long x = n/2050;
            int sum = 0;
            
            while(x>0) {

                sum+= x%10;
                x/=10;

            }
            System.out.println(sum);
        }
        
    }
}