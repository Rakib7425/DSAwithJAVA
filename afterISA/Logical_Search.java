import java.util.*;

// import java.util.Scanner;
class Logical_Search {
	// Function to find a missing term in a sequence
	public static int findMissingTerm(int[] nums) {
		// search space is nums[left…right]
		int left = 0, right = nums.length - 1;

		// calculate the common difference between successive elements
		int diff = (nums[nums.length - 1] - nums[0]) / nums.length;

		// loop till the search space is exhausted
		while (left <= right) {
			// find the middle index
			int mid = right - (right - left) / 2;

			// check the difference of middle element with its right neighbor
			if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
				return nums[mid + 1] - diff;
			}

			// check the difference of middle element with its left neighbor
			if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
				return nums[mid - 1] + diff;
			}

			// if the missing element lies on the left subarray, reduce
			// our search space to the right subarray nums[left…mid-1]
			if (nums[mid] - nums[0] != (mid - 0) * diff) {
				right = mid - 1;
			}

			// if the missing element lies on the right subarray, reduce
			// our search space to the right subarray nums[mid+1…right]
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] nums = new int[n];

			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}

			System.out.println(findMissingTerm(nums));
		}
	}
}

/*
 * 
 * Logical search
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a sequence of n numbers such that the difference between the
 * consecutive terms is constant, find the missing term in logarithmic time.
 * Assume that the first and last elements are always part of the input sequence
 * and the missing number lies between index 1 to n-1.
 * Solve the problem using divide and conquer approach.
 * Input
 * first line contain a single integer N.
 * second line contain N space separated integer A[i].
 * Output
 * print missing number in given array.
 * 
 * Constraint :
 * 1<=N<=10^5
 * 1<=A[i]<=10^9
 * Example
 * Sample Input 1:
 * 5
 * 5 7 9 11 15
 * 
 * Sample Output 1:
 * 13
 * 
 * Sample Input 2:
 * 5
 * 1 4 7 13 16
 * 
 * Sample Output 2:
 * 10
 */