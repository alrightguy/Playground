#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
  	cin>>s;
   int i;
    if(s.size()==0)
    {
      cout<<-1<<endl;
      return 0;
    }
    vector<int>arr(26,0);
    for(i = 0;i<s.size();i++)
    {
      arr[s[i]-'a']++;
    }
  int ans = 0;
  for(i  = 0;i<26;i++)
  {
    if(arr[i]>ans)
      ans = arr[i];
  }
  cout<<ans<<endl;
    return 0;
}