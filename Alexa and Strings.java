import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void Alexa(String str){
        int last=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                last=i+1;
            }
        }
        System.out.println(last);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        Alexa(str);
    }
}