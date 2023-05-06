import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int minReplacements(String s, String t) {
    int replacements = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != t.charAt(i)) {
            replacements++;
        }
    }
    return replacements;
}

    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        String str1= sc.next();
            System.out.println( minReplacements(str,str1));
    }
}