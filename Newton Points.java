import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String s = sc.next();
        int points = p;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o') {
                points++;
            } else {
                points--;
            }
            if (points < 0) {
                points = 0;
            }
        }
        System.out.println(points);
    }
}