#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main() 
{ 
    ll m,n;
    cin>>m>>n;
    if(m%15!=0)
    {
        m = 15*( (m/15)+1 );
    }
    ll temp = n;
    if(n%15==0)
    {
        n = 15*(n/15 - 1);
    }
  else
  {
    n = 15*(n/15);
  }
    ll sum = 0,num_of_terms = 0;
    num_of_terms = ((n - m)/15) + 1;
    if(num_of_terms%2==0)
      sum = (num_of_terms/2) * (2*m + 15*(num_of_terms-1));
    else
       sum = (num_of_terms) * ((2*m + 15*(num_of_terms-1))/2);
    cout<<sum<<endl;
    return 0;
}