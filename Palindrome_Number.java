import java.util.Scanner;

public class Palindrome_Number {
     static void isPalindrome(int N)
{
	// Your code here
  int r,sum=0,temp;   
  temp=N;    
  while(N>0){    
   r=N%10;  //getting remainder  
   sum=(sum*10)+r;    
   N=N/10;    
  }    
  if(temp==sum){    
   System.out.print("True, YES Your number is  Palindrome Number");
     }    
  else{    
   System.out.print("False, NO Your number is not Palindrome Number");
     }  
}

public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
          int num = sc.nextInt();
          isPalindrome(num);
     }
}
}
