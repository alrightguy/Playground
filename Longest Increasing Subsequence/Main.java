// Longest Increasing Subsequence
// Given an array, find the length of the longest increasing subsequence (LIS) of a given sequence such that all elements of the subsequence are sorted in increasing order.



// Input Format:

// Input1=>size of array

// Remaining input corresponds to array elements



// Output Format:

// Output length of the Longest Increasing Sub-sequence in the given array.


// Case 1
// Case 2
// Input (stdin)
// 9
// 10 22 9 33 21 50 41 60 80

// Output (stdout)
// 6

#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  vector<int>arr(n,0);
  int i;
  for(i = 0;i<n;i++)
  {
    cin>>arr[i];
  }
  int j= 0;
  vector<int>ans(arr.size(),1);
  for(i = 0;i<n;i++)
  {
    for(j = 1;j<n;j++)
    {
      if(arr[j]>arr[i] && ans[i]+1>ans[j])
      {
        ans[j] = ans[i]+1;
      }
    }
  }
  int answer = 0;
  for(i = 0;i<n;i++)
  {
    if(ans[i]>answer)
      answer = ans[i];
  }
  cout<<answer<<endl;
}