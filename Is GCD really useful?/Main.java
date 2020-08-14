#include<iostream>
using namespace std;
long long int get_gcd (long long int n,long long int m)
{ 
  if(n%m==0)
    return m;
  else return get_gcd(m,n%m);
}
int main()
{
  long long int a,b;
  cin>>a>>b;
  cout<< get_gcd(a,b)<<endl;
  //Type your code here
}