/*
Problem Statement
Print a number between A and B (inclusive) that is a multiple of C. If such numbers exist, print the minimum among them. If there is no such number, print -1.
Input
The input contains three space separated integers.
A B C

Constraints
0≤X≤1000
All values in input are integers.
Output
Print the answer.
If there is no number with the desired property, print -1.
Example
Sample Input 1
123 456 100
Sample Output 1
200

Sample Input 2
630 940 314
Sample Output 2
-1
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int min=-1;

        for(int i=a;i<=b;i++){
            if(i%c==0){
                min=i;
                break;
            }
        }

        System.out.println(min);
    }
}