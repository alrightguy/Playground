#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int sum = 0;
  int temp = 0;
  for(int i = 0;i<=3;i++)
  {
    if(i%2==0)
    	temp = max(max(a%10,b%10),c%10);
    else
        temp = min(min(a%10,b%10),c%10);           
    a = a/10;b = b/10;c = c/10;
    sum = temp * pow(10,i) + sum;
  }
                   cout<<sum<<endl;
  return 0;
}