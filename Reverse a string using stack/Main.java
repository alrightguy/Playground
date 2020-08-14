#include<bits/stdc++.h>
using namespace std;
int main()
{
  stack<char>s;
  string s1;
  cin>>s1;
  for(int i =0;i<s1.size();i++)
  {
    s.push(s1[i]);
  }
  for(int i=0;i<s1.size();i++)
  {
    cout<<s.top();
    s.pop();
  }
  return 0;
}