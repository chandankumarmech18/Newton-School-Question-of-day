
/* 
 
XOR of even divisors
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a number n, and you have to tell XOR of all even divisors of n.
Input
The first line of input contains a single integer n.

Constraints:-
1 ≤ n ≤ 106
Output
Print XOR of all even divisors of n.
Example
Sample Input:
8

Sample Output:
14

Explanation:
All even divisors of 8 = 2, 4, 8.
XOR(2, 4, 8) = 14.


*/

// Solution ----> By Chandan Kumar

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for (int i = 2; i <= n / 2; i += 2) {
            if(n%i==0){
            temp ^=i;
            
            }
        }
        if(n%2==0){
            temp^=n;
        }
        System.out.println(temp);
    }
}