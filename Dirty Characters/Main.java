#include <bits/stdc++.h>
using namespace std;
int main()
{
  string s1, s2;
  cin >> s1 >> s2;
  unordered_map<char, int>m;
  int i;
  for (i = 0; i < s2.size(); i++)
  {
    m[s2[i]]++;
  }
for (i = 0; i < s1.size(); i++)
{
  if (m.count(s1[i]) == 0)
    cout << s1[i];
}
return 0;
} 