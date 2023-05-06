import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean flag = false;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(j)) {
                      j++;
                } else {   

                        j = 0;                                                                                     
                }
                if (j == t.length()) {
                        flag = true;
                        break;
                }
        }

        if (flag) {

                System.out.println("Yes");
        } else {
        System.out.println("No");
        }
    }
}