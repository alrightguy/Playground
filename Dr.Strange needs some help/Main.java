#include <iostream>
using namespace std;
long long int power(long long int x, long long int n)
{
  int result = 1;
  while (n > 0)
  {
    if (n % 2 != 0)
    {
      result = result * x;
    }
    x = x * x;
    n = n / 2;
  }
  return result;
}
int main()
{
  // Try out your code here
  long long int m, n, req, temp;
  cin >> m >> n >> req;
  temp = power(m, n);
  //cout << temp << endl;;
  if (temp >= req)
    cout << "Doctor, you can proceed with your experiment." << endl;
  else
    cout << "Sorry Doctor! You need more bacteria." << endl;
  return 0;
}