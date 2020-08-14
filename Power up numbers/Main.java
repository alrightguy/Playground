// Power up numbers


// The first input is an integer denoting the base(X).

// The second input is an integer denoting the power(N).

// Output Format

// The output is an integer denoting the calculated power of a number.

// Refer the sample output for formatting

// Sample Input

// 2

// 3

// Sample Output

// 8
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
   
    int n,m;
    cin>>n>>m;
    ll ans = get_power(n,m);
    cout<<ans<<endl;
    return 0;
}