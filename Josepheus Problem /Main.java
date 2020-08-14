#include<iostream>
using namespace std;
int helper(int n,int k)
{
  if(n==1)
    return 0;
  else
    return (helper(n-1,k) + k)%n;
}
int main()
{
  int n,k;
  cin>>n>>k;
  int ans = (helper(n-1,k) + k)%n +1;
  cout<<ans<<endl;
  return 0;
}