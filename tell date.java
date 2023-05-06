import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(input);
        Date red = sdf.parse("2022/06/20");
        if (date.before(red)) {
            System.out.println("Before");
        } else {
            System.out.println("After");
        }
    }
}