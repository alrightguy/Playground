#include<bits/stdc++.h>
using namespace std;
int main()
{
  stack<int>s;
  int temp;
  cin>>temp;
  if(temp<0){
   cout<<"Queue is empty"<<endl;
    return 0;
  }
  cout<<"Before reversing:"<<endl;
  while(temp>0)
  {
    cout<<temp<<" ";
    s.push(temp);
    cin>>temp;
  }
  cout<<endl<<"After reversing:"<<endl;
  while(!s.empty())
  {
    cout<<s.top()<<" ";
    s.pop();
  }
  return 0;
}