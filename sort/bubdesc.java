
   // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class bubdesc {	
public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
           a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+" ");
		}
        sc.close();             
	}
}

    

