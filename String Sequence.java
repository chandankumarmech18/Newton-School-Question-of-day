import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
          Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i = 0; i<26; i++){
            arr[i] = sc.nextInt();
            char c=(char)(arr[i]+96);   
             System.out.print(c);
        }     
    }
}