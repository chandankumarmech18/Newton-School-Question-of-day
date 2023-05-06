import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        for(int i = 1; i <= k; i++){
            if(n%200 == 0){
                n = n/200;
            }
            else{
                n = Long.valueOf(n+""+200);
            }
        }
        System.out.println(n);
    }
}