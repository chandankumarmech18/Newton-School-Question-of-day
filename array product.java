import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        long result =1;
        for(int i=0;i<n;i++)
        {
            long ans =sc.nextLong();

            if(Math.log10(ans)+Math.log10(result)<18 ){
                result *= ans;

            }
            else if(ans==0)
            {
                result=0;
            }
            else// if(ans != -1)
            {
                //result * = ans;
                result =-1;
            }
        }
        System.out.println(result+" ");
    }
}