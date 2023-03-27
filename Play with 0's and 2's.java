import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger k = scanner.nextBigInteger();
        StringBuilder sb = new StringBuilder();
        while (k.compareTo(BigInteger.ZERO) > 0) {
            if (k.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                sb.append("0");
                k = k.divide(BigInteger.valueOf(2));
            } else {
                sb.append("2");
                k = k.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
            }
        }
        System.out.println(sb.reverse().toString());
    }
}