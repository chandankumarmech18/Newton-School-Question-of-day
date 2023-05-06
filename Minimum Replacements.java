import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		char[] s = new char[S.length()];
		char[] t = new char[T.length()];
		for (int i = 0; i < s.length; i++) {
			s[i] = S.charAt(i);
		}
		for (int i = 0; i < t.length; i++) {
			t[i] = T.charAt(i);
		}
		int min = 0;
		for (int i = 0; i < s.length-t.length+1; i++) {
			int count = 0;
			for (int j = 0; j < t.length; j++) {
				if (s[i+j] == t[j]) {
					count++;
				}
			}
			if (i==0) {
				min = t.length-count;
			}
			if (min>t.length-count) {
				min = t.length-count;
			}
		}
		System.out.println(min);
	}
}