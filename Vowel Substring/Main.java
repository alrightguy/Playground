// Vowel Substring
// Given a string of lowercase letters in the range ascii[‘a’-‘z’], determine the number of substrings that can be created where every letter is a vowel is present at least once. The vowels are [‘a’, ‘e’, ‘i’, ‘o’, ‘u’]. A substring is a contiguous group of characters in the string. For example, string s= ‘aeioaexaeuiou’. There is a substring to the left that is made of vowels, ‘aeioae’ which is followed by an ‘x’. Since ‘x’ is not an vowel, it cannot be included in the substring and this substring does not contain all of the vowels. It is not a qualifying substring moving to the right, there are four substrings that do qualify ‘aaeuiou’, ‘aaeuio’, ‘aeuiou’ and ‘aeuio’. Function Description: Complete the function vowelSubstring in the editor below. The function must returns an integer that denotes the number of substrings which consists of vowels only [‘a’, ‘e’, ‘i’, ‘o’, ‘u’] where every vowel appears at least once. vowelSubstring has the following parameter(s): S: a string

// Input Format

// First line consists of a string s.

// Output Format

// Output is in the form of integer that denotes number of substrings which consists of vowel only.

// Constraints

// 1<=size(s)<=105

// S[i] belongs to ascii[‘a’-‘z’](where0<=i<=size_of(s))

// Refer the sample output for formatting

// Sample Input:

// aaeiouxa

// Sample Output:

// 2


#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int helper(string s)
{
  int j = 0;
  unordered_map<char, int>m;
  m['a'] = 0;
  m['e'] = 0;
  m['i'] = 0;
  m['o'] = 0;
  m['u'] = 0;
  int ans = 0;
  for (int i = 0; i < s.size(); i++)
  {
    m[s[i]]++;
    auto it = m.begin();
    for (; it != m.end(); it++)
    {
      if (it->second == 0)
        break;
    }
    if (it == m.end())
    {
      ans = ans + s.size() - i;
      do {
        m[s[j]]--;
        if (m[s[j]] > 0)
        {
          ans = ans + s.size() - i;
          j++;
        }
        else
        {
          j++;
          break;
        }
      } while (true);
    }
  }
  return ans;
}
int main()
{

  string s;
  cin >> s;
  string news;
  unordered_map<char, int>m;
  m['a'] = 0;
  m['e'] = 0;
  m['i'] = 0;
  m['o'] = 0;
  m['u'] = 0;
  int ans = 0;
  for (int i = 0; i < s.size(); i++)
  {
    if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
    {
      news = news + s[i];
      m[s[i]]++;
    }
    else
    {
      auto it = m.begin();
      for (; it != m.end(); it++)
      {
        if (it->second == 0)
          break;
      }
      if (it == m.end())
      {
        //cout << news << endl;
        ans += helper(news);
        //cout << ans << endl;
      }
      for (auto it = m.begin(); it != m.end(); it++)
      {
        it->second = 0;
      }
      news = "";
    }
  }
  if (news.size() != 0)
  {
    //cout << news << endl;
    ans += helper(news);
  }
  cout << ans << endl;
  return 0;
}