import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int pro=(int)Math.pow(n,2);
        int bro=(int)Math.pow(n,3);
        int sum=n+pro+bro;
        System.out.println(sum);
        
    }
}