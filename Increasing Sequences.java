import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] sequence = new int[n];
        generateSequences(sequence, 0, 1, m);
    }

    public static void generateSequences(int[] sequence, int index, int start, int end) {
        if (index == sequence.length) {
            printSequence(sequence);
            return;
        }
        for (int i = start; i <= end; i++) {
            sequence[index] = i;
            generateSequences(sequence, index + 1, i + 1, end);
        }
    }

    public static void printSequence(int[] sequence) {
        for (int i : sequence) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}