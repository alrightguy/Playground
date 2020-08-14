#include<iostream>
using namespace std;
int main()
{
  int temp;
  cin>>temp;
  int ans = 0;
  while(temp!=-1)
  {
    if(temp>=ans)
      ans = temp;
    cin>>temp;
  }
  cout<<"Maximum element is "<<ans<<endl;
  return 0;
}