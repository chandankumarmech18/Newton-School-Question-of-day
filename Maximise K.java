import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=n;
        while((k&(k-1))!=0){
            k=k&(k-1);
        }
        System.out.println(k-1);
    }
}