import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long cycle = A + B;
        long blueCards = N / cycle * A + Math.min(N % cycle, A);
        System.out.println(blueCards);
    }
}