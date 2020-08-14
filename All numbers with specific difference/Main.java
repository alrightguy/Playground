// All numbers with specific difference
// Given a positive number N and a number D, write a program to find the count of numbers smaller than N such that the difference between the number and sum of its digits is greater than or equal to given specific value D.
// Input Format

// The first line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains two space separated integers N and D.

// Output Format

// For each test case, print the count of numbers smaller than N such that the difference between the number and sum of its digits is greater than or equal to D.

// Constraints

// 1 <= T <= 100

// 1 <= N <= 105

// 1 <= D <= 104

// Refer the sample output for formatting

// Sample Input:

// 13 2

// Sample Output:

// 4

// Case 1
// Input (stdin)
// 13 2

// Output (stdout)
// 4
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int get_diff(int n)
{
    int temp = n;
    while(temp>0)
    {
        n = n - (temp%10);
        temp = temp/10;
    }
    return n;
}
int main() 
{ 
    int n,d;
    cin>>n>>d;
    int beg = 0,end = n;
    int temp = -1;
    while(beg<=end)
    {
        int mid = beg + (end - beg)/2;
        if(get_diff(mid)>=d)
        {
            temp = mid;
            end = mid-1;
        }
        else
        {
            beg = mid + 1;
        }
    }
    if(temp==-1)
        cout<<0<<endl;
    else
    {
        cout<<n+1-temp;

    }
    return 0;
}