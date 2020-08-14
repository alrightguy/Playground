// Wildcard Pattern Matching
// Given a text and a wildcard pattern, find if the wildcard pattern is matching with the text. The matching should cover the entire text.
// Input Format:

// Input1 => String

// Input2 => Pattern

// Output Format:

// Output is a string true or false

// Sample Input:

// abby
// a*y

//ab
//?b
// Sample Output:

// true
// true

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
	string p;
	cin >> p;
	vector< vector<bool> > dp(s.size() + 1, vector<bool>(p.size() + 1, false));
	dp[0][0] = true;
	int i, j;
	for (i = 1; i <= p.size(); i++)
	{
		if (p[i - 1] == '*')
		{
			dp[0][i] = dp[0][i - 1];
		}
	}
	for (i = 1; i <= s.size(); i++)
	{
		for (j = 1; j <= p.size(); j++)
		{
			if (s[i - 1] == p[j - 1] || p[j - 1] == '?')
			{
				dp[i][j] = dp[i - 1][j - 1];
			}
			else if (p[j - 1] == '*')
			{
				dp[i][j] = (dp[i - 1][j] || dp[i][j - 1]) ? true : false;
			}
		}
	}
	// for (i = 0; i <= s.size(); i++)
	// {
	// 	for (j = 0; j <= p.size(); j++)
	// 	{
	// 		cout << dp[i][j] << " ";
	// 	}
	// 	cout << endl;
	// }
	if (dp[s.size()][p.size()])
		cout << "true";
	else
		cout << "false";
	return 0;
}