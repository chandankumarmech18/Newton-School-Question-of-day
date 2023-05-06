import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int x = sc.nextInt();
        int k = 0;
        if(n<=x){
            k = (int)Math.ceil((double)x/n);
            char ch = (char)(k + 64);
            System.out.println(ch);
        }
        else{
             System.out.println('A');
        }
    }
}