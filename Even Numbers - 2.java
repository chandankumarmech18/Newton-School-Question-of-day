import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
       int count=0;
        for(int i=n+1;i<m;i++){
            if(i%2==0 && count<5){
                System.out.print(i+" ");
                count++;
                
            }
        }
    }
}