import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		int temp = 0;
		
		temp += Math.min(a,  k);
		k -= Math.min(a,  k);
		k -= Math.min(b, k);
		temp -= Math.min(c,  k);
		System.out.println(temp);
		
//		
//		
//		if(k > a) {
//			k -= a;
//			score = a;
//
//			if(k > b) {
//				k -= b;
//				if(k > c) {
//					score -= c;
//				}
//				else {
//					score -= k;
//				}
//			}
//		}
//		else if(k == a || k < a){
//			score = k;
//		}
//		System.out.println(score);
		

	
    }
}