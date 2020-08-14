// Longest Common Subsequence
// Given two strings, return the length of their longest common subsequence. A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings. If there is no common subsequence, return 0.



// Input Format

// The input consists of two strings separated by space



// Output Format

// The output consists of an integer which is the length of the longest common subsequence



// Refer the sample output for formatting

// Sample Input:

// AGGTAB GXTXAYB

// Sample Output:

// 4
#include<bits/stdc++.h>
using namespace std;

int main()
{
  string s1,s2;
  cin>>s1>>s2;
  vector< vector<int> >arr(s1.size()+1,vector<int>(s2.size()+1,0));
  int i,j;
  for(i = 1;i<=s1.size();i++)
  {
    for(j = 1;j<=s2.size();j++)
    {
      if(s1[i-1]==s2[j-1])
      {
        arr[i][j] = arr[i-1][j-1] + 1;
      }
      else
        arr[i][j] = max(arr[i-1][j],arr[i][j-1]);
    }
  }
  cout<<arr[s1.size()][s2.size()];
  return 0;
}