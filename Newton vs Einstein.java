import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();
        int s = scan.nextInt();
        while (p > 0 && r > 0) {
            if (p > 0) {
                r -= q;
            }
            if (r > 0) {
                p -= s;
            }
        }
        if (p <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}