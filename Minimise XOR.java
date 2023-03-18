import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        int a0 = 0;
        int b1 = 0;
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<(int)Math.pow(2,n); i++){
            a0 = 0;
            b1 = 0;
            for(int j=0; j<n; j++){
                if((i>>j & 1) ==1 || j==(n-1)){
                   a0 = a0|a[j];
                   b1 = b1^a0;
                   a0 = 0; 
                }else{
                   a0 = a0|a[j];
                }
            }
            //int ch = a0^b1;
            //System.out.println(a0+" "+b1+" "+i+" "+ch);
            ans = (int)Math.min(ans, b1);
        }
        System.out.println(ans);
    }
}