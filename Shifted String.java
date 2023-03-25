import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.next();

        // int x = Math.abs(k-n);
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < k.length(); i++){
            char x = k.charAt(i);
            sb.append((char)((x-'A'+n)%26 + 'A'));
        }
            System.out.print(sb);
       
    }
}