import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int getMaxSum(int x, int y, int z, int c) {
		int sum = 0;
		
		// add all the 1s
		int min = Math.min(x, c);
		sum += min * 1;
		c -= min;
		min = Math.min(y, c);
		sum += min * 0;
		c -= min;
		
		min = Math.min(z, c);
		sum += min * (-1);
		
		return sum;
	}
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int k=sc.nextInt();

        int s=sc.nextInt();

        System.out.println(getMaxSum(n,m,k,s));

    }
}