// Reaching the nth step of a staircase
// A naughty kid is climbing a staircase of 'n' steps. He can take either 1 step or 2 steps at a time. Write a program to find the number of distinct ways to reach the nth step. Assume he is standing on the 0th step.



// Sample Input:

// 4



// Sample Output:

// 5



// Constraints:

// 1 <= n <= 40

#include <bits/stdc++.h>
using namespace std;
int helper(int n,vector<int>&moves)
{
  if(n<0)
    return 0;
  else if(n==0)
    return 1;
  else if(moves[n]>0)
    return moves[n];
  else
  {
    int m1 =0;
    int m2 = 0;
    m1 = helper(n-1,moves);
    m2 = helper(n-2,moves);
    moves[n] = m1 + m2;
    return moves[n];
  }
}
int main() 
{
   int n;
   cin>>n;
   vector<int>moves(n+1,0);
   int ans = helper(n,moves);
  cout<<ans<<endl;
   return 0;
}