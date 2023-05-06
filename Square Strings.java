import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean flag = false;
        for (int i = 1; i <= n/2; i++) {
        if (n % i == 0) {
        String sub = s.substring(0, i);
        StringBuilder sb = new StringBuilder(sub);
        sb.append(sub);
        if (sb.toString().equals(s)) {
        flag = true;
        break;
                 }
         }
     }
        if (flag) {
        System.out.println("Yes");
        } else {
        System.out.println("No");
        }
    }
}