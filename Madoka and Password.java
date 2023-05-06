import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int m;
        if(n%3==1){
            m=1;
        }
        else{
            m=2;
        }
        while(n>0){
            System.out.print(m);
            n-=m;
            m-=3;
            m=Math.abs(m);
        }
    }
}