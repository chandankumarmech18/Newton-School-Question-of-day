import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4;
        String[] input = scanner.nextLine().split(" ");
        num1 = Integer.parseInt(input[0]);
        num2 = Integer.parseInt(input[1]);
        num3 = Integer.parseInt(input[2]);
        num4 = Integer.parseInt(input[3]);
        if (num2 > num4 || num3 - num1 > num4 - num2) {
            System.out.println("-1");
        } else {
            System.out.println((num1 - num3) + 2 * (num4 - num2));
        }
     //    scanner.close();
    }
}