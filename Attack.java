import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long d = sc.nextLong();

        boolean vi = false; 
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x < s && y > d) { 
                vi = true; 
                break;
            }
        }
        
        if (vi) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}