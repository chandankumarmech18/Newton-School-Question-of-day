import java.util.*;

class Trie {
    Trie[] children;
    long beauty;

    Trie() {
        children = new Trie[2];
        beauty = 0;
    }
}

public class Main {
    static Trie root;
    static final int MOD = 1000000007;

    public static void insert(String s, long beauty) {
        Trie current = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '0';
            if (current.children[index] == null) {
                current.children[index] = new Trie();
            }
            current = current.children[index];
            current.beauty = (current.beauty + beauty) % MOD;
        }
    }

    public static long findSum(String s) {
        Trie current = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '0';
            if (current.children[index] == null) {
                return 0;
            }
            current = current.children[index];
        }
        return current.beauty;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        root = new Trie();
        while (n-- > 0) {
            String s = sc.next();
            long beauty = sc.nextLong();
            insert(s, beauty);
        }
        while (q-- > 0) {
            String s = sc.next();
            System.out.println(findSum(s));
        }
        sc.close();
    }
}