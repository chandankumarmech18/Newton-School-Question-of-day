import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if(y<0){
            x=-x;
            y=-y;
            z=-z;

        if(x<y){
		System.out.println(Math.abs(x));
	    }
        else{
		    if(z>y){
			System.out.println("-1");
		}else{
			System.out.println(Math.abs(z)+Math.abs(x-z));
		}
	  }
     }
    }
}