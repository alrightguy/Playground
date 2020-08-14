#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  cout<<"Stack 1 Elements:"<<endl;
  vector<int>arr(n,0);
  for(i = 0;i<n;i++)
  {
    cin>>arr[i];
  }
   for(i = n-1;i>=0;i--)
  {
     cout<<arr[i]<<" ";
  }
  int n2;
  cin>>n2;
  cout<<endl<<"Stack 2 Elements:"<<endl;
  vector<int>arr2(n2,0);
  for(i = 0;i<n2;i++)
  {
    cin>>arr2[i];
  }
   for(i = n2-1;i>=0;i--)
  {
     cout<<arr2[i]<<" ";
  }
  cout<<endl;
  int g1,g2;
  cin>>g1;
  if(g1>arr.size())
    cout<<"Stack underflow. pop from stack 1 failed"<<endl;
  cout<<"Stack 1 Elements:"<<endl;

    for(i=arr.size()-1-g1;i>=0;i--)
    {
      cout<<arr[i]<<" ";
    }
  
  cout<<endl;
  
  cin>>g2;
  if(g2>arr2.size())
    cout<<"Stack underflow. pop from stack 2 failed";
   cout<<"Stack 2 Elements:"<<endl;
 
    for(i=arr2.size()-1-g2;i>=0;i--)
    {
      cout<<arr2[i]<<" ";
    }
  cout<<endl;
  
}