import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        int max = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }

         for(int i=0;i<n;i++){
            sum += arr[i];
            }


            sum =  sum - max;

        if(sum>max){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        }
        

    }