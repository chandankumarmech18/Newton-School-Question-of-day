import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int count = 0;
        while (allEven(a)) {
            for (int i = 0; i < n; i++) {
                a[i] = a[i]/2;
            }
            count++;
        }

        System.out.println(count);
    }

    public static boolean allEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}