 // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class java4{
	public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int arr[]=new int[N];
for(int i=0;i<N;i++)
{
	arr[i]=sc.nextInt();

}
int prev =arr[0];
arr[0]=arr[0]*arr[1];
for(int i=1;i<N-1;i++)
{ int curr;
  curr=arr[i];
  arr[i]=prev * arr[i+1];
  prev = curr;

}
arr[N-1]=arr[N-1]*prev;
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}




 
 

sc.close();
	}
}
