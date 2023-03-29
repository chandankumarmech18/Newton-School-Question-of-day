import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
       
        int diffCount = 0;
        int i = 0;
        int j = 0;
        while (i < s.length() && diffCount <= 2) {
            if (s.charAt(i) != t.charAt(j)) {
                diffCount++;
                i++;
                if (i < s.length() && s.charAt(i) != t.charAt(j)) {
                    diffCount++;
                }
            }
            i++;
            j++;
        }
        if (diffCount <= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}