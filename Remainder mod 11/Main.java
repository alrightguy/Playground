#include<bits/stdc++.h>
using namespace std;
int main()
{
  int sum_odd = 0,sum_even = 0;
  string s;
  cin>>s;
  int i;
  for(i = 0;i<s.size();i++)
  {
    if(i%2==0)
    	sum_even += s[i]-'0';
    else
      sum_odd += s[i]-'0';
  }
  cout<<abs(sum_even-sum_odd);
  return 0;
}