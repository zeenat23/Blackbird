 // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
 public class bubble {
	public static void main (String[] args) {
    Scanner sc =new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0;i<T;i++)
    {
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
    
        for(int j=0;j<n-1;j++){
            for(int k=0;k<n-j-1;k++){
                if(a[k]>a[k+1]){
                    int temp =a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        for(int k=0;k<n;k++){
        System.out.println(a[k]+" ");
        
		}
    }
           
       
        
    
   
    sc.close();
	}
}
    

