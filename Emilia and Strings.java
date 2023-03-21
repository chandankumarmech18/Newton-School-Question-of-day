
/*
Problem Statement
Emilia loves to play with strings. Help her find the K- th lexicographically smallest string among the strings that are permutations of a string S.
Input
The input consists of a string and an integer separated by a space.
S K

Constraints
1 ≤ ∣S∣ ≤ 8
S consists of lowercase English letters.
There are at least K distinct strings that are permutations of S.
Output
Print the answer.
Example
Sample Input 1
aab 2
Sample Output 1
aba

Sample Input 2
baba 4
Sample Output 2
baab

Sample Input 3
ydxwacbz 40320
Sample Output 3
zyxwdcba
*/

import java.util.*;

public class Main {
    static final int MAX_CHAR = 26;
    static final int MAX_FACT = 20;
    static int[] factorials = new int[MAX_FACT];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String string = sc.next();
        int n = sc.nextInt();
        String nthPerm = getNthPermute(string, n);
        System.out.println(nthPerm);
    }

    public static String getNthPermute(String string, int n) {
        factorials[0] = 1;
        for (int i = 1; i < MAX_FACT; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        int size = string.length();

        int[] occurrence = new int[MAX_CHAR];
        for (int i = 0; i < size; i++) {
            occurrence[string.charAt(i) - 'a'] += 1;
        }

        char[] res = new char[MAX_CHAR];
        int Sum = 0;
        int k = 0;

        while (Sum != n) {
            Sum = 0;
            for (int i = 0; i < MAX_CHAR; i++) {
                if (occurrence[i] == 0) {
                    continue;
                }

                occurrence[i] -= 1;

                int temp_sum = factorials[size - 1 - k];
                for (int j = 0; j < MAX_CHAR; j++) {
                    temp_sum /= factorials[occurrence[j]];
                }
                Sum += temp_sum;

                if (Sum >= n) {
                    res[k] = (char)(i + 'a');
                    n -= Sum - temp_sum;
                    k += 1;
                    break;
                }

                if (Sum < n) {
                    occurrence[i] += 1;
                }
            }
        }

        int i = MAX_CHAR-1;
        while (k < size && i >= 0) {
            if (occurrence[i] != 0) {
                res[k] = (char)(i + 'a');
                occurrence[i] -= 1;
                i += 1;
                k += 1;
            }

            i -= 1;
        }

        return new String(res, 0, k);
    }
}