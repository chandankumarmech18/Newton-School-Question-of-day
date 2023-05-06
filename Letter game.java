import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc =new Scanner(System.in);
        String c1= sc.next();
        if(c1.charAt(0)==c1.charAt(1) && c1.charAt(2)==c1.charAt(1))
        System.out.println("Won");
        else
        System.out.println("Lost");
    }


}