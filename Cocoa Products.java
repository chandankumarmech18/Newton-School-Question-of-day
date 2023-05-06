import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A >= 15 && B >= 8) {
            System.out.println(1);
        } else if (A >= 10 && B >= 3) {
            System.out.println(2);
        } else if (A >= 3) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}