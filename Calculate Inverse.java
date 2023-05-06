import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
            sum += 1/a[i];
        }
        double result = 1/sum;
        System.out.printf("%.8f",result);
    }
}