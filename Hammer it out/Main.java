#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
  ll temp;
  cin>>temp;
  ll sum1 = 0,sum2 = 0,i = 0;
  while(temp>0)
  {
    if(i==0)
    {
      sum1 +=temp%10;
      temp = temp/10;
      i = 1;
    }
    else
    {
      sum2 +=temp%10;
      temp = temp/10;
      i = 0;
    }
  }
  cout<<sum1 - sum2;
}