import java.util.Scanner;

public class Main {
    public static void mergeSort(int[] nums) {
    if (nums.length <= 1) {
        return;
    }

    int mid = nums.length / 2;
    int[] left = new int[mid];
    int[] right = new int[nums.length - mid];

    System.arraycopy(nums, 0, left, 0, mid);
    System.arraycopy(nums, mid, right, 0, nums.length - mid);

    mergeSort(left);
    mergeSort(right);

    merge(nums, left, right);
}

public static void merge(int[] nums, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            nums[k] = left[i];
            i++;
        } else {
            nums[k] = right[j];
            j++;
        }
        k++;
    }

    while (i < left.length) {
        nums[k] = left[i];
        i++;
        k++;
    }

    while (j < right.length) {
        nums[k] = right[j];
        j++;
        k++;
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
             A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(K==0){
                break;
            }
                int count = Math.min(K, A[i]/X);
                A[i] -= count*X;
                K -= count;

        }
        mergeSort(A);
        long sum =0;
        
        for(int i=0;i<N-K;i++){
            sum += A[i];
        }
        System.out.println(sum);
    }
}