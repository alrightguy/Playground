#include<iostream>
using namespace std;
int find_gcd(int a,int b)
{
  if(b==0)
    return 0;
  if(a%b==0)
    return b;
  else
  {
    return find_gcd(b,a%b);
  }
}
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
    int gc1 = find_gcd(a,b);
  	gc1 = find_gcd(gc1,c);
  if(gc1==ans)
    cout<<"Answer is correct."<<endl;
  else
    cout<<"Answer is wrong."<<endl;
   //Your code goes here
    
}