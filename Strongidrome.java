import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
    }
    return true;
}

static void isStrongPalindrome(String s) {
    if (!isPalindrome(s)) {
        System.out.println("No");
        return;
    }
    int n = s.length();
    if (!isPalindrome(s.substring(0, (n - 1) / 2)) || !isPalindrome(s.substring((n + 3) / 2 - 1))) {
        System.out.println("No");
        return;
    }
    System.out.println("Yes");
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        isStrongPalindrome(s);
    }
}