import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        long N = scan.nextLong();

        long t = (long) Math.sqrt(N);
        Set<Long> set = new HashSet<>();
        for(long i = 2; i <= t; i++){
            long k = 2;
            while(Math.pow(i, k) <= N){
                double l = Math.pow(i,k);
                set.add((long) l);
                k++;
            }
        }

        System.out.println(N - set.size());
    }
}