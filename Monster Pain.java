import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            while(arr[i]!=arr[i-1]){
                if(arr[i]>arr[i-1]){
                    arr[i]=arr[i]%arr[i-1]==0? arr[i-1]: arr[i]%arr[i-1];
                }
                else if(arr[i]<arr[i-1]){
                    arr[i-1]=arr[i-1]%arr[i]==0? arr[i]:arr[i-1]%arr[i];
                }
            }
        }
        System.out.println(arr[n-1]);
    }
}