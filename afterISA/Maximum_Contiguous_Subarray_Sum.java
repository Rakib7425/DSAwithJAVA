// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Maximum_Contiguous_Subarray_Sum {


    public static long maxSumCont(int arr[],int n){
        long ans=Integer.MIN_VALUE;
        long currentSum = 0;

        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>ans){
                ans=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        
        return ans;
    }

    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-- > 0){
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println(maxSumCont(arr,n));
            }
        }
    }
}