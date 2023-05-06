import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
long ans = 0, sum = 0;
n = sc.nextInt();
long[] a = new long[n];
for (int i = 0; i < n; i++) {
a[i] = sc.nextLong();
sum = (sum + a[i]) % 1000000007;
}
for (int i = 0; i < n; i++) {
sum = (sum - a[i] + 1000000007) % 1000000007;
ans = (ans + (a[i] * sum) % 1000000007) % 1000000007;
}
System.out.println(ans);
}
}