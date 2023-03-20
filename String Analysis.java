
/*

Problem Statement
You are given a string S ending with er or ist.
If S ends with er, print er; if it ends with ist, print ist.
Input
The input consists of a string.
S

Constraints
2≤∣S∣≤20
S consists of lowercase English letters.
S ends with er or ist.
Output
Print the answer.
Example
Sample Input 1
coder
Sample Output 1
er

Sample Input 2
tourist
Sample Output 2
ist

Sample Input 3
er
Sample Output 3
er
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

		String str = sc.nextLine(); 
		
		if('r' == str.charAt(str.length()-1)) {
			System.out.println("er");
		}
		else{
			System.out.println("ist");
		}
    }
}