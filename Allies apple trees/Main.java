#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int main()
{
  ll n;
  cin >> n;
  ll a = n;
  ll beg = 1, end = 1000000;
  ll ans = 0;
  while (beg <= end)
  {
    ll mid = beg + (end - beg) / 2;
    ll temp = mid * mid * 12;
    ans = 8 * mid;
    if (temp == n)
    {
      break;
    }
    else if (temp < n)
    {
      beg = mid + 1;
    }
    else
      end = mid - 1;
  }
  cout << ans << endl;
  return 0;
}