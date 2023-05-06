import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int count = 0;
        for (int i = 0; i < n; i++) {
            String t = s.substring(0, i) + s.substring(i + 1);
            if (isPalindrome(t)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}