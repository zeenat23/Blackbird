import java.util.*;
public class countprime {
   
      static boolean isPrime(int n)
      {
          for(int i=2;i*i<=n;i++)// 2*2<5
          {
              if(n%i==0)
              {
                  return false;
              }
          }
          return true;//true
            
      }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
          int count =0;
        int n = sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        System.out.println(count);
      sc.close();
	}
}
    

