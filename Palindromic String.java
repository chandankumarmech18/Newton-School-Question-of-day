import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i++;
            j--;
        }
        
        if (i >= j) {
            System.out.println("Yes");
        } else {
            int k = 0;
            for (int l = n - 1; l >= i; l--) {
                if (s.charAt(l) == 'a') {
                    k++;
                } else {
                    break;
                }
            }
            if (k >= j - i + 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}