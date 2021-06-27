// for handling input/output
    import java.util.*; // contains Collections framework
    
    // don't change the name of this class
    // you can add inner classes if needed
    public class java1 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            long[] arr =new long[c];
            for(int i=0;i<c;i++){
                arr[i]=sc.nextLong();
            }
            int flag =0;
            for(int i=0;i<c;i++){
            if(arr[i]<0){
                flag = 1;
            }
            }
            if(flag==1)
            {
                System.out.println("Yes");
            }
            else
            {
            System.out.println("No");	
            }
    
            sc.close();              // Your code here
        }
    }
    
    

