import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long count=0;
HashMap<String, Long> map = new HashMap<String,Long>();
for(int i=0; i<n; i++)
{
   char[] ch=sc.next().toCharArray(); 
 Arrays.sort(ch);
String str=new String(ch);
 if(map.containsKey(str))
{

map.put(str, map.get(str) + 1);
count += map.get(str);
}
else
{
 map.put(str, (long)0);
}
}
System.out.print(count);
    }
}