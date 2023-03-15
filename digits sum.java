import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
		int b = sc.nextInt();
        
		int ans = Math.max(a%10+a/10%10+a/100, b%10+b/10%10+b/100);
		System.out.println(ans);
        
    }
}