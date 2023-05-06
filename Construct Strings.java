import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] freq = new int[26];
        for (int i = 0; i < b.length(); i++) {
            freq[b.charAt(i) - 'a']++;
        }
        boolean possible = true;
        for (int i = 0; i < a.length(); i++) {
            if (freq[a.charAt(i) - 'a'] <= 0) {
                possible = false;
                break;
            } 
            else {
                freq[a.charAt(i) - 'a']--;
            }
        }
        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}