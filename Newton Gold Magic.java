import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Double> minHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            minHeap.offer(sc.nextDouble());
        }
        double result = 0;
        while (minHeap.size() > 1) {
            double weight1 = minHeap.poll();
            double weight2 = minHeap.poll();
            double newWeight = (weight1 + weight2) / 2;
            minHeap.offer(newWeight);
        }
        result = minHeap.poll();
        System.out.printf("%.8f",result);
    }
}