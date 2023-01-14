// create class here and its methods as well

class SumCalculator{
    public int num1;
    public int num2;

    SumCalculator(int a,int b){
        num1=a;
        num2=b;
    }

    public int sum(){
        return num1+num2;
    }

    public int sum2(int a,int b){
        return a+b;
    }

    public int fromObject(SumCalculator obj1, SumCalculator obj2){
         return obj1.sum() + obj2.sum();
    }

    //main()
    //SumCalculator obj=new SumCalculator()
}

/*
 * 
 * Sum Calculator (OOPs)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a class with the name SumCalculator. The class needs two fields (public variables) with names num1 and num2 both of type int.

Write the following methods (instance methods):
*Method named sum without any parameters, it needs to return the value of num1 + num2.
*Method named sum2 with two parameters a, b, it needs to return the value of a + b.
*Method named fromObject with two parameters of type sumCalculator object named obj1 and obj2, and you have to call sum function for respective object and return sum of both

NOTE: All methods should be defined as public, NOT public static.
NOTE: In total, you have to write 3 methods.
NOTE: Do not add the main method to the solution code.
Input
You don't have to take any input, You only have to write class SumCalculator.
Output
Output will be printed by tester, "Correct" if your code is perfectly fine otherwise "Wrong".
Example
Sample Input:
1

Sample Output:
Correct
 */