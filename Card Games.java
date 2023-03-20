
/*

Problem Statement
We have five cards with integers A, B, C, D, and E written on them, one on each card.

This set of five cards is called a Full house if and only if the following below condition is satisfied:
1. Any three cards with the same number written on them
2. Rest two cards with the same numbers written on them.

Determine whether the set is a Full house.
Input
The input consists of 5 space separated integers.
A B C D E

Constraints
1≤A, B, C, D, E≤13
Not all of A, B, C, D, and E are the same.
All values in input are integers.
Output
If the set is a Full house, print Yes; otherwise, print No.
Example
Sample Input 1
1 2 1 2 1
Sample Output 1
Yes

Sample Input 2
12 12 11 1 2
Sample Output 2
No

*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int[]arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
 
        if ((arr[0] == arr[2] && arr[3] == arr[4]) || (arr[0] == arr[1] && arr[2] == arr[4])) {
            System.out.println("Yes");
        } 

        else {
            System.out.println("No");
        }
    }
}

