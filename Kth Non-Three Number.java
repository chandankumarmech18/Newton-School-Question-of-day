import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
       

        int count = 0;
        int num = 1;
        while (true) {
            if (num % 3 != 0 && num % 10 != 3) {
                count++;
            }
            if (count == k) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}