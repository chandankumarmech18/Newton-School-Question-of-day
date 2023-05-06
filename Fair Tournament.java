import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        if(Math.min(a,b) > Math.max(c,d)){
            System.out.println("No");

        }
        else if(Math.min(c,d) > Math.max(a,b)){
            System.out.println("No");

        }
        else {
            
            System.out.println("Yes");
        }
    }
}