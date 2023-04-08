import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int N,X,Y,Z;
    static int arr[];
    static int min  = Integer.MAX_VALUE;
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
         X = sc.nextInt();
          Y = sc.nextInt();
           Z = sc.nextInt();
           
           arr = new int[N];
           for(int i=0;i<N;i++){
               arr[i]=sc.nextInt();
           }
           dfs(0,0,0,0,0);
           System.out.println(min);
    }
           static void dfs(int current ,int a,int b,int c,int ans){
               if(current ==N)
               {
                   if(a==0||b==0||c==0){
                       return;
                   }
                           else{
                               ans+=Math.abs(X-a)+Math.abs(Y-b)+Math.abs(Z-c)-30;
                               min=Math.min(min,ans);
                               return;
                           }
                   }
                   dfs(current+1,a,b,c,ans);
                   dfs(current+1,a+arr[current],b,c,ans+10);
                   dfs(current+1,a,b+arr[current],c,ans+10);
                   dfs(current+1,a,b,c+arr[current],ans+10);

               }
           }