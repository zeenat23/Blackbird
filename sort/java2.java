// for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class java2{
	public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0){
	         int n=sc.nextInt();
             int flag =0;
			 if(n<2){
				
                System.out.println("No");
                break;
			 }
			 if(n==2){
                System.out.println("Yes");
                break;
			 }
			 for(int i=2;i*i<n;i++){
				 if(n%i==0){
                     flag=1;
					 System.out.println("No");
                     break;
					
					
				 }
			 }
		        if(flag==0){
				 System.out.println("Yes");
                }
			 
			 t--;
		}
       sc.close();               // Your code here
	}
}