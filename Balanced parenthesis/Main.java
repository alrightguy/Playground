#include<bits/stdc++.h>
using namespace std;
using namespace std;
int main()
{
  string s;
  cin>>s;
  stack<char>st;
  for (int i = 0; i < s.size(); i++)
  {
    if (s[i] == '(' || s[i] == '{' || s[i] == '[')
      st.push(s[i]);
    else if (s[i] == ')' || s[i] == '}' || s[i] == ']')
    {
      if (st.empty() == false && ((s[i] == ')' && st.top() == '(') || (s[i] == '}' && st.top() == '{') || (s[i] == ']' && st.top() == '[')))
      {
        st.pop();
      }
      else
      {
        cout << "Not Balanced";
        return 0;
      }
    }
    else
    {
      cout << "Not Balanced";
      return 0;
    }
  }
  if (st.empty())
    cout << "Balanced";
  else
    cout << "Not Balanced";
  return 0;
}