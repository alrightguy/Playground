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

  string s;
  cin >> s;
  int count = 0;
  int i;
  string ans = "";
  for (i = 0; i < s.size(); i++)
  {
    if (s[i] == '-')
      count++;
    else
      ans = ans + s[i];
  }
  for (i = 0; i < count; i++)
  {
    cout << '-';
  }
  cout << ans << endl;
  return 0;
}