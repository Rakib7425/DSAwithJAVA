#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    int primeDigits(int n)
    {
        queue<int> q;
        q.push(0);
        for (int i = 0; i <= n;)
        {
            int res = q.front();
            q.pop();
            i++;
            q.push((res * 10) + 2);
            if (i == n)
                break;
            i++;
            q.push((res * 10) + 3);
            if (i == n)
                break;
            i++;
            q.push((res * 10) + 5);
            if (i == n)
                break;
            i++;
            q.push((res * 10) + 7);
            if (i == n)
                break;
        }
        return q.back();
    }
};

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.primeDigits(n) << "\n";
    }
}

/*
 * Nth number made of prime digits
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
 * Input
 * The first line contains a single integer T i.e. the number of test cases. The first and only line of each test case consists of a single integer N.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 100000
 * Output
 * For each testcase print the nth number of the given sequence made of prime digits in a new line.
 * Example
 * Input:
 * 2
 * 10
 * 21
 *
 * Output:
 * 33
 * 222
 *
 * Explanation:
 * Testcase 1: 10th number in the sequence of numbers whose each digit is prime is 33.
 * Testcase 2: 21th number in the sequence of numbers whose each digit is prime is 222.
 *
 *
 */