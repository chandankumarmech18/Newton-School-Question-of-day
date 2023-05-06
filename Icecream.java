import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

            int[] icecreamCount = new int[m + 1]; 
            
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                for (int j = 0; j < k; j++) {
                    int a = sc.nextInt();
                    icecreamCount[a]++;
            }
            }
            
            int mutualIcecreams = 0; 
            for (int i = 1; i <= m; i++) {
                if (icecreamCount[i] == n) {
                    mutualIcecreams++;
                }
            }
            
            System.out.println(mutualIcecreams);
        }
    }
// }