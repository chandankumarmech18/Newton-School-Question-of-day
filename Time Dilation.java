import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int S = sc.nextInt();
        double timeOnEarth = (double) H / S;
        System.out.printf("%.5f", timeOnEarth);
    }
}