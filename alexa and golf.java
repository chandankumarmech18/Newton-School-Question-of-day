import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % k == 0 || b % k == 0) {
        System.out.println("OK");
        }
        else if((a / k) != (b / k)) {
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }
}