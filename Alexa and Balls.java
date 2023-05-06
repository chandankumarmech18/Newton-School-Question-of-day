import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
        // Your code here
    public static int min(int a, int b, int c, int d) {
    long l = 0;
    long r = 1000000000;
    while(l < r) {
      long m = (l + r) / 2;
      if (a + m * b <= m * c * d) {
        r = m;
      } else {
        l = m + 1;
      }
    }

    if(a + l * b <= l * c * d) {
      return (int) l;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    System.out.println(min(a, b, c, d));
  }
    
}