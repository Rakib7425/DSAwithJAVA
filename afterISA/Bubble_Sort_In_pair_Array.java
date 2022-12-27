// ? Answer should be this
/*
!
static class  secondelement implements Comparator<Pair> 
{
    public int compare(Pair a, Pair b)
    {
        if(a.x==b.x)
        {
            return b.y-a.y;
        }
        return b.x - a.x;
    }
}
static Pair[] SortPair(Pair arr[], int n)  { 
 //enter your code here
Arrays.sort(arr, new secondelement());
return arr;
 }
 
*/










// /**
//  * Bubble_Sort_In_pair_Array
//  */
// public class Bubble_Sort_In_pair_Array {

//     public static void main(String[] args) {
//         SortPair(arr,n);
//     }
// }
/*
 * Bubble sort in pair array
easy
Problem Statement
Given an array of n pairs of integers . Your task is to sort the array on the basis of first element of pairs in descending order . If the first element are equal in two or more pairs then give preference to the pair who has greater second element value.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SortPair() that takes the array of pair and the integer N(size of array) as a parameter.

Custom Input
The first line of input will be a single integer N. The next line of input contains 2*N space separated integers where unique adjacent elements are pairs. Custom input for 1st sample:-
4
1 2 3 4 5 6 7 8

Constraints:-
1<=N<=103
1<=value<=105
Output
Return the sorted array of pairs.
Example
Sample Input:
4
(1, 2), (3, 4), (5, 6), (7, 8)

Sample Output:
(7, 8), (5, 6), (3, 4), (1, 2)

Sample Input:
3
(1, 1), (2, 2), (3, 3)

Sample Output:
(3, 3), (2, 2), (1, 1)

Sample Input:
3
(1, 1), (1, 2), (3, 3)

Sample Output:
(3, 3), (1, 2), (1, 1)

Explanation :
(1,2) and (1,1) has same first element . But (1,2) has greater second element so (1,2) comes before (1,1) in sorted array .
 */