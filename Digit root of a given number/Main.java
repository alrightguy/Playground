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
  int n;
  cin >> n;
  int sum = 0, temp = 0;
  while (n > 10)
  {
    temp = n;
    sum = 0;
    while (temp > 0)
    {
      sum += temp % 10;
      temp = temp / 10;
    }
    n = sum;
  }
  cout << n << endl;
}