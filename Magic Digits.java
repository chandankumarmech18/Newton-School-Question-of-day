import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        
        while (input.length() > 1) {
            int sum = 0;
            
            for (char c : input.toCharArray()) {
                sum += c - '0';
            }
            
            input = String.valueOf(sum);
            count++;
        }
        
        System.out.println(count);
    }
}