import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        boolean canWin = canWin(H, A);
        if (canWin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean canWin(int H, int[] A) {
        // sort the moves in descending order
        java.util.Arrays.sort(A);
        for (int i = A.length - 1; i >= 0; i--) {
            if (H <= 0) {
                return true;
            }
            H -= A[i];
        }
        return H <= 0;
    }
}