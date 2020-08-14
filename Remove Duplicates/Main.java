#include <bits/stdc++.h>
using namespace std;
int main()
{
  string s;
  cin >> s;
  vector<int>arr(26, 0);
  for (int i = 0; i < s.size(); i++)
  {
    if (arr[s[i] - 'a'] == 0)
      arr[s[i] - 'a'] = 1;
  }
  for (int i = 0; i < s.size(); i++)
  {
    if(arr[s[i]-'a'] ==1)
      cout<<s[i];
    arr[s[i]-'a'] =0;
  }
  return 0;
}