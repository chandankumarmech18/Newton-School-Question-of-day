import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean flag = false;
        int w = a.length(), y = b.length();
        int x = Math.max(w,y);
        for(int i =0; i<x; i++){
            int num1 = 0, num2 = 0;
            if(i < w){
                num1 = Character.getNumericValue(a.charAt(w-i-1));
            }
            if(i < y){
                num2 = Character.getNumericValue(b.charAt(y-i-1));
            }
            if(num1 + num2 > 9){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Hard");
        }
        else{
            System.out.println("Easy");
        }
    }
}