import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long countTriplets(long N, long K){
	if (K % 2 == 0){
		long x = N / K;
		long y = (N + (K / 2)) / K;

		return x * x * x + y * y * y;
	}
    else{
		long x = N / K;
		return x * x * x;
	}
}
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        
       System.out.print(countTriplets(N, K));
    }
}