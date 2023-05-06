import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }

    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }

    return true;
}
public static int countDistinctPrimeDivisors(int number) {
    int count = 0;

    for (int i = 2; i <= number; i++) {
        if (isPrime(i) && number % i == 0) {
            count++;
            while (number % i == 0) {
                number /= i;
            }
        }
    }

    return count;
}


    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         int nearlyPrimeCount = 0;
        for (int i = 1; i <= n; i++) {
            if (countDistinctPrimeDivisors(i) == 2) {
                nearlyPrimeCount++;
            }
        }

        System.out.println(nearlyPrimeCount);
    }
}