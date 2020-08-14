#include<bits/stdc++.h>
using namespace std;
int main()
{
  //type your code
  string s;
  cin>>s;
  stack<int>s1;
  for(int i = 0;i<s.size();i++)
  {
     if(s[i]=='(' ||s[i] == '+' ||s[i]=='-' ||s[i] =='*'||s[i]=='/')
     {
       s1.push(s[i]);
     }
    else if(s[i]==')')
    {
      int num = 0;
      while(s1.top()!='(')
      {
        s1.pop();
        num++;
      }
      s1.pop();
      if(num==0)
      {
        cout<<"Yes"<<endl;
        return 0;
      }
    }
  }
  cout<<"No"<<endl;
  return 0;
}