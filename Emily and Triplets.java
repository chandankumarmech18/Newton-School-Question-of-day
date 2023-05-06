import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= S; i++) {
            for (int j = 0; j <= S - i; j++) {
                for (int k = 0; k <= S - i - j; k++) {
                    if (i + j + k <= S && i * j * k <= T) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}