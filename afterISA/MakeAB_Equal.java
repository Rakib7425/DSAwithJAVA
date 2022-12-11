// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeAB_Equal {
    static void findMinOperations(int A[],int B[],int n){
        int x=0;//count/sum 1 in element of Array A
        int y=0;//count/sum 1 in element of Array B
        int z=0;//count difrence in Array A and B
        for(int i=0;i<n;i++){
            if(A[i]==1)
               x++;
        }

        for(int i=0;i<n;i++){
            if(B[i]==1)
               y++;
        }

        for(int i=0;i<n;i++){
            if(A[i]!=B[i])
               z++;
        }

        int ans=Math.min(z,Math.abs(x-y)+1);
        System.out.print(ans);
    }
    public static void main (String[] args) {
        try ( Scanner in = new Scanner(System.in)) {
          int n=in.nextInt();
             int A[]=new int[n];
             int B[]=new int[n];

             for(int i=0;i<n;i++)
                 A[i]=in.nextInt();

             for(int j=0;j<n;j++)
                 B[j]=in.nextInt();
             
          findMinOperations(A,B,n);
     }
        
    }
}