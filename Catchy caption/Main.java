#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  if(s.size()>100)
    cout<<"Caption not eligible for the contest"<<endl;
  else
  {
    int i= 0;
    int count = 0;
    for(i = 0;i<s.size();i++)
    {
      if(s[i]==' ')
        count++;
    }
    if(count>10)
    {
       cout<<"Caption not eligible for the contest"<<endl;
    }
    else
    {
      cout<<"Caption eligible for the contest"<<endl;
    }
  }
}