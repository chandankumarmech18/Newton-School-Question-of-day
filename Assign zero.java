import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int print(int arr[]){
        for(int i=0;i<5;i++){
            if(arr[i]==0){
                return i+1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(print(arr));
    }
}