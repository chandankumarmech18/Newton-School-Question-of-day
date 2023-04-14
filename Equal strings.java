import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = scan.next();
            if (map.containsKey(s)) {
                int count = map.get(s);
                System.out.println(s + "(" + count + ")");
                map.put(s, count + 1);
            } else {
                System.out.println(s);
                map.put(s, 1);
            }
        }
    }
}