import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        s = s.replaceAll(".", "x");
        System.out.println(s);
    }
}