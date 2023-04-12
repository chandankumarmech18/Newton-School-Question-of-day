import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr= new int[n];
        Arrays.fill(arr,-1);
         
         for(int m =sc.nextInt(); m>0;--m)
         {
             int pi = sc.nextInt()-1;
             int qi = sc.nextInt();

             if(n>1 &&pi+qi==0|| arr[pi]>0 && arr[pi]!=qi)
             {
                 System.out.println(-1);
                 return;
             }
             arr[pi]=qi;
         }
         for(int i=0;i<n;++i)
         
          if(arr[i]<0)
             arr[i]=i<1 && n>1? 1:0;
             System.out.println(Arrays.toString(arr).replaceAll("\\D",""));
         
    }
}