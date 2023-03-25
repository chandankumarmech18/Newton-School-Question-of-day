import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Map<Integer, Integer> map = new HashMap<>();
            for (int i=1; i<=n; i++) {
                map.put(i,4);
            }
            System.gc();
            
            for (int i = 0; i<4*n-1; i++) {
                int num = sc.nextInt();
                map.put(num, map.get(num) - 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()==1) {
                    System.out.println(entry.getKey());
                    break;
            }
        }
    }
}