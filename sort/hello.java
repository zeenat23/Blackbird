import java.util.*;
class HelloWorld {
    public static void main( String []args ) {
        Scanner sc = new Scanner(System.in);
		int count =0;
       int N = sc.nextInt();
	   int ar[]=new int[N];
	   for(int i=0;i<N;i++)
	   {
		   ar[i]=sc.nextInt();

	   }
	   for(int i=0;i<ar.length;i++)
	   {
		   if((i+1)%2==1)
		   {
             if(ar[i]%2==1)
			 {
				 count++;
			 }
		   }
		   else
		   {
			   if(ar[i]%2==0)
			   {
				   count++;
			   }
		   }
	   }
       System.out.print(count);
       sc.close();
        
    }
}
