
/*
Problem Statement
You drew lottery N times. In the i- th draw, you got an item of the kind represented by a string Si. How many kinds of items did you get?
Input
The first line of the input consists of a single integer N. The next N lines consists of N strings.
N
S1
S2
.
.
.
SN

Constraints
1 ≤ N ≤ 2×10^5
Si consists of lowercase English letters and has a length between 1 and 10 (inclusive).
Output
Print the number of kinds of items you got.
Example
Sample Input 1
3
apple
orange
apple
Sample Output 1
2

Sample Input 2
5
grape
grape
grape
grape
grape
Sample Output 2
1
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

		Set<String> set = new HashSet<>();
        
		for (int i=0; i<n; i++) {
			set.add(sc.next());
		}
		System.out.println(set.size());
    }
}