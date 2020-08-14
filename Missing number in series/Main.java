// Array special product
// Implement a function which, given an array of integers, return a new array for which every index carries the value of the product of the remaining elements. 
// Example:

// Given array [1, 2, 3, 4, 5] it would return [120, 60, 40, 30, 24]

// Given array [4, 10, 3] it would return [30, 12, 40]

// Function Description:

// The function find Special Product accepts the following parameters.

// An array of integers “input” of size n.

// The function must return a new array of size n in which every index carries the value of the product of the remaining elements.

// Input Format

// First line specifies the number of elements on the array.

// Next n lines has a list of integers.

// Output Format

// Output has an array of n integers with each integer in a line.

// Constraints

// Division operator cannot be used.

// Expected time complexity is strictly O(n)

// 0<=n<=5

// 0<=in[i]<=10; 0<=i<=n

// Refer the sample output for formatting

// Sample Input:

// 5

// 1

// 2

// 3

// 4

// 5

// Sample Output:

// 120

// 60

// 40

// 30

// 24
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int main() 
{ 
    int n,i;
    cin>>n;
    vector<int>arr(n,0);
    ll pr = 1;
    for(i=0;i<n;i++)
    {
      cin>>arr[i];          
    }
    int d = (arr[n-1]-arr[0])/n;
    for(i=0;i<n-1;i++)
    {
      if(arr[i]+d!=arr[i+1])
      {
        cout<<arr[i]+d;
        break;
      }
    }
    return 0;
}