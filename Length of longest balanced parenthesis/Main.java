// Length of longest balanced parenthesis
// Write a program to find the length of the longest balanced parenthesis.
// Input Format

// The input consists of the parenthesis of type string

// Output Format

// The output consists of the length of the longest balanced parenthesis

// Sample Input

// ()()

// Sample Output

// 4

// Case 1
// Case 2
// Input (stdin)
// ()()

// Output (stdout)
// 4
#include<bits/stdc++.h>
using namespace std;
int main()
{
  stack<char>st1;
  stack<int>st2;
  st2.push(-1);
  string s;
  cin>>s;
  int i;
  int len = 0;
  for(i = 0;i<s.size();i++)
  {
    if(s[i]=='(')
    {
      st1.push('(');
      st2.push(i);
    }
    else
    {
      if(st1.empty()==false)
      {
        st1.pop();
        st2.pop();
        if(i-st2.top()>len)
          len = i-st2.top();
      }
      else
      {
        st2.push(i);
      }
    }
  }
  cout<<len<<endl;
  return 0;
}