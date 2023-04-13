import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String t = "ABC";
        int count = 0;
        for (int i = 0; i <= N - 3; i++) {
            if (s.substring(i, i + 3).equals(t)) {
                count++;
            }
        }
        System.out.println(count);
    }
}