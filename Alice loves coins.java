import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fiveHundredCoins = x / 500;
        int remaining = x % 500;
        int fiveCoins = remaining / 5;
        int enjoymentPoints = fiveHundredCoins * 1000 + fiveCoins * 5;
        System.out.println(enjoymentPoints);
    }
}