import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

       if(s.length()==1){

        System.out.print(s+s+s+s+s+s);
       }
       else if(s.length()==2){

        System.out.print(s+s+s);
       }
       else{

        System.out.print(s+s);
       }
    }
}