import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
 class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    for (int i = N; i >= 1; i--) {
      sum += (long)(i-1);
    }
    System.out.println(sum);
  }
}