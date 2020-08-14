#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
void swapit(int *x, int*y)
{
  if (*x != 0 && *y != 0)
  {
    *x = (*x) * (*y);
    *y = (*x) / (*y);
    *x = (*x) / (*y);
  }
  else
  {
    if (*x == 0 && *y != 0)
    {
      *x = *y;
      *y = 0;
    }
    else if (*x != 0 && *y == 0)
    {
      *y = *x;
      *x = 0;
    }
  }
}
int main()
{
  int x , y;
  cin >> x >> y;
  cout << "Before swapping a= " << x << " and b=" << y << endl;
  swapit(&x, &y);
  cout << "After swapping a= " << x << " and b=" << y << endl;
  return 0;
}