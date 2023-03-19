import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // int b = sc.nextInt();

        int c = Integer.valueOf(a+b); 
        int d = (int)Math.sqrt(c);
        if(c == d*d)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}