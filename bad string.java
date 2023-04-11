import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        int flag =0;
        for(int i=0;i<str.length();i+=2){
            if(str.charAt(i)<=90){
               flag =1;
            }
            
        }
        if(flag==1){
             System.out.println("No");
        }
        else{
             System.out.println("Yes");
        }
    }
}