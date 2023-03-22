import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc. nextInt();

        if(c>=a && c> b){
            System.out.println(a+b);
        }
        else if(a>=b && a>=c){
            System.out.println(b+c);
        }
        else{
            System.out.println(c+a);
        }
    }
}