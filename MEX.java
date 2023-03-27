import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
      for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
                if(arr[i]>count){
                    System.out.println(count);
                    return;
                }
            if(arr[i]==count){
                count++;
            }
        }
            System.out.println(count);
    }
}