
/*
Problem Statement
You are given an integer N between 0 and 9999 (inclusive).
Print it as a four-digit string after appending the necessary number of leading zeros.
Input
The input consists of a single integer.
N

Constraints
0≤N≤9999
N is an integer.
Output
Print the four digit string after appending to it the necessary number of leading zeros.
Example
Sample Input 1
321
Sample Output 1
0321

Sample Input 2
7777
Sample Output 2
7777
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(String.format("%04d",n));
    }
}