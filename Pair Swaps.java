import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        List<Long> a = new ArrayList<Long>();
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for(long i = 0; i < n; i++){
        a.add(scan.nextLong());
        }
        for(int i = 0; i < n; i++){
        if(map.containsKey(a.get((int)i))){
            map.put(a.get(i), map.get(a.get(i))+1);
        }else{
            map.put(a.get((int)i), 1L);
        }
        }
        long ans = (n*(n-1))/2;
        for(long i : map.values()){
        if(i != 1){
            ans -= (i*(i-1))/2;
        }
        }
        System.out.println(ans);
        
    }
}