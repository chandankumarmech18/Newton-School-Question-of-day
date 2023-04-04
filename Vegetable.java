import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            for (int c = 0; c <= x; c++) {
                if (i + c == x && 2 * c + 4 * i == y) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}