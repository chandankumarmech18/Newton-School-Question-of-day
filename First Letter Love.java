import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        String prevWord = sc.next();
        set.add(prevWord);
        boolean flag = true;
        for (int i = 1; i < n; i++) {
            String currWord = sc.next();
            if (currWord.charAt(0) != prevWord.charAt(prevWord.length() - 1) || set.contains(currWord)) {
                flag = false;
                break;
            }
            prevWord = currWord;
            set.add(prevWord);
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}