#include<iostream>
using namespace std;
long long int fact(int n)
{
  if(n==0)
    return 1;
  else
  {
    return n*fact(n-1);
  }
}
int main()
{
  long long int n;
  cin>>n;
  long long int ans = fact(n);
  cout<<"The factorial of "<<n<<" is "<<ans<<endl;
  //Type your code here.
}