//Input Format

// The input consists of an integer.

// Output Format

// If it is an Armstrong number, display “Yes ” or display “No”.

// Constraints

// 1 <= n <= 1010

// Refer the sample output for formatting

// Sample Input

// 153

// Sample Output

// Yes
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
ll get_power(ll x,ll n)
{
    ll result =1;
    while(n>0)
    {
        if(n%2!=0)
            result = result * x;
        x= x*x;
        n = n/2;
    }
    return result;
}
int main()
{
  ll  n,temp;
  cin>>n;
  temp = n;
  ll num = 0;
  while(temp>0)
  {
    num++;
    temp = temp/10;
  }
  ll sum = 0;
  temp = n;
  while(temp>0)
  {
    int a = temp%10;
    sum = sum + get_power(a,num);
    temp = temp/10;
  }
  //cout<<sum<<endl;
  if(sum==n)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  return 0;
}