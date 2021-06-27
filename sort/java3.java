
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class java3 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
	
		
		for(int i=0;i<N;i++)
		{	int divcount =0;
			int S = sc.nextInt();
         for(int j=2;j<=S;j++)
		{
			int count =0;
			for(int k=1;k<=j;k++)
			{
				if(j%k==0)
				{
					count++;
				}
			}
		if(count==3)
		{
			divcount++;
		}
		}
		System.out.println(divcount);
		}
		sc.close();
	}
}
