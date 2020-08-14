//Is it a prime?
#include<bits/stdc++.h>
using namespace std;
int main()
{
  long long int n;
  cin>>n;
  int i;
  for(i =2;i<=sqrt(n);i++)
  {
    if(n%i==0)
    {
      cout<<"Not Prime"<<endl;
      return 0;
    }
  }
  cout<<"Prime"<<endl;
  return 0;
}