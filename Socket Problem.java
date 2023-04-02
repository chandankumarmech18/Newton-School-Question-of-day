import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int p=print(A,B);
     System.out.println(p);
  }
  static int print(int a, int b){
    for(int i=1; i<b;i++){
      if(b<(a*i)){
        return i;
      }
    }
    return 0;
  }
}