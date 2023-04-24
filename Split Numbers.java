import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean possible = true;
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < 2*n; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount != evenCount) {
            possible = false;
        }
        System.out.println(possible ? "Yes" : "No");
        sc.close();
    
    }
}