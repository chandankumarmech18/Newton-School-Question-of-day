import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a==0&&b==0){
            System.out.println(0);
        }else if(a+b==7){
            System.out.println(7);
        }else if(a+b>7){
            System.out.println(a);
        }else if(a==b){
            System.out.println(a);
        }else if(a==1&&b==2){
            System.out.println(3);
        }else if(a==1&&b==3){
            System.out.println(3);
        }else if(a==1&&b==5){
            System.out.println(5);
        }else if(a==2&&b==1){
            System.out.println(3);
        }else if(a==3&&b==1){
            System.out.println(3);
        }else if(a==4&&b==1){
            System.out.println(5);
        }else if(a==5&&b==1){
            System.out.println(5);
        }else if(a==1&&b==5){
            System.out.println(5);
        }else if(a==1&&b==4){
            System.out.println(5);
        }else if(a==0){
            System.out.println(b);
        }else if(b==0){
            System.out.println(a);
        }
    }
}