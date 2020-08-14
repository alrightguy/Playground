// Edit Distance
// Given two strings, find out the minimum number of operations required to convert string 1 to string 2. The operations allowed are Insert/Delete/Replace a character.



// Sample Input:

// string 1: hello

// string 2: hllo



// Sample Output:

// 1


// Case 1
// Case 2
// Case 3
// Input (stdin)
// hello
// hllo

// Output (stdout)
// 1

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
  string s1, s2;
  cin >> s1 >> s2;
  int i, j;
  vector<vector<int> >arr(s1.size() + 1, vector<int>(s2.size() + 1, 0));
  arr[0][0] = 0;


  for (j = 1; j <= s2.size(); j++)
  {
    arr[0][j] = j;
  }
  for (i = 1; i <= s1.size(); i++)
  {
    arr[i][0] = i;
  }
  for (i = 1; i <= s1.size(); i++)
  {
    for (j = 1; j <= s2.size(); j++)
    {
      if (s1[i - 1] == s2[j - 1])
      {
        arr[i][j] = arr[i - 1][j - 1];
      }
      else
      {
        arr[i][j] = 1 + min(min(arr[i - 1][j], arr[i][j - 1]), arr[i - 1][j - 1]);
      }
    }
  }
  cout << arr[s1.size()][s2.size()];
  return 0;
}