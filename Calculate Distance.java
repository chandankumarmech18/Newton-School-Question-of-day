import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int total_time = a + b + c;
        int xyz_time = a + b;
        int xzy_time = a + c;
        int yzx_time = b + a;
         yzx_time = b + c;
        int zyx_time = c + a;
         zyx_time = c + b;
        int min_time = Math.min(xyz_time, xzy_time);
        min_time = Math.min(min_time, yzx_time);
        min_time = Math.min(min_time, yzx_time);
        min_time = Math.min(min_time, zyx_time);
        min_time = Math.min(min_time, zyx_time);

        System.out.println(min_time);
    }
}