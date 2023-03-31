import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    // sc.close();

    long NewtonCookies = A - Math.min(A, K);
      long EinsteinCookies = B - Math.min(B, Math.max(0, K - A));

    System.out.println(NewtonCookies + " " + EinsteinCookies);
  }
}