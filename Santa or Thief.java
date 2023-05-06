import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

int[] A = new int[N];

int[][] X = new int[N][N];

int[][] Y = new int[N] [N];

for (int i = 0; i < N; i++) {

A[i]= sc.nextInt();
 for (int j = 0; j < A[i]; j++) {
 X[i][j]=sc.nextInt() - 1;
 Y[i][j] = sc.nextInt(); 
 }
}
int max_santas = 0;

for (int i = 1; i < (1 << N); i++) {
     int count = 0;
     long[] santa =new long [N];
      for (int j=0; j < N; j++) {
      santa[j] = (i >> j) & 1;
      }

     for (int j=0; j < N;j++){ 
         if (santa[j] == 1) {
          count++;

        for (int k = 0; k < A[j]; k++) {
             if (santa[X[j][k]] != Y[j][k]) { 
            count = -1;
            j = N;
            break;
             }
        }
         }
     }
     max_santas = Math.max(max_santas, count);
    }
    System.out.println(max_santas);
}
}