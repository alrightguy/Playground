#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int arr[n];
  int mi = 0,max_i = 0;
  for(int i = 0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i = 1;i<n;i++)
  {
    if(arr[i]<arr[mi])
    {
      mi = i;
    }
    if(arr[i]>arr[max_i])
    {
      max_i= i;
    }
  }
  int ans = 0;
  if(max_i<mi)
  {
    ans = max_i + n-1-mi;
  }
  else
  {
    ans  = max_i + n-2-mi;
  }
  cout<<ans<<endl;
  return 0;
}