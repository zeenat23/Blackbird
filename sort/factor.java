import java.util.*;
public class factor {
   
	 static  int gcd(int m,int n ){
		if (m == n){
            return m;
        }
	      if (m > n){
		    return gcd(m-n, n);
	    }
	     return gcd(m, n-m);
    }


			
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n = sc.nextInt();
		System.out.print(gcd(m,n));
        sc.close();
           
	}
}
    

