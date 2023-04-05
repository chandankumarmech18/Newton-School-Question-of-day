import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long mod=1000000007;
    public static void main (String[] args)  {
             
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        long[] arr=new long[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextLong();
        }

        long sum=0;
        for(int i=0;i<60; i++)
        {
            long count=0;

            for(int j=0; j<n; j++)
            {
                if( ((arr[j]>>i) & 1) == 1)
                {
                    count++;
                }
                
            }

            long temp = (count * (n-count)) % mod;
            for(int j=0; j<i; j++)
            {
                temp = (temp * 2) % mod;
            }

            sum += temp;
            sum %= mod;
        }

        System.out.println(sum);
    

    }
}