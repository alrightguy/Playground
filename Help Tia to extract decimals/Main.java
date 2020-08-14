#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin>>s;
  if(s.find('.')!=-1)
  {
    cout<<"Floating part is : ";
    for(int i = s.find('.')+1;i<s.size();i++)
    {
      cout<<s[i];
    }
  }
  else
  {
    cout<<"Floating part is :";
  }
}