import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
             Scanner sc = new Scanner(System.in);
         Set<Integer> data = new LinkedHashSet<>();   
         data.add(sc.nextInt());
         data.add(sc.nextInt());
         data.add(sc.nextInt());
         data.add(sc.nextInt());
         data.add(sc.nextInt());

         System.out.println(data.size());
    }
}