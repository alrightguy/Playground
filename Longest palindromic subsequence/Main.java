// Longest palindromic subsequence
// Given a string, write a program to find the longest palindromic subsequence.
// Sample Input

// abcdefghcba

// Sample Output

// abchcba

// Case 1
// Input (stdin)
// abcdefghcba

// Output (stdout)
// abchcba
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
void lcs(string a, string b, vector<vector<int> >&dp)
{
	int i, j;
	for (i = 0; i < a.size(); i++)
	{
		for (j = 0; j < b.size(); j++)
		{
			if (i == 0)
			{
				if (a[0] == b[j])
				{
					dp[0][j] = 1;
				}
			}
			else
			{
				if (a[i] == b[j])
				{
					if (j > 0)
						dp[i][j] = dp[i - 1][j - 1] + 1;
					else
						dp[i][j] = 1;
				}
				else
				{
					if (i > 0 && j > 0)
						dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
					else if (i > 0)
						dp[i][j] = dp[i - 1][j];
					else
						dp[i][j] = dp[i][j - 1];
				}

			}
		}
	}
}
int main()
{
	string s;
	cin >> s;
	string a;
	a = string(s.rbegin(), s.rend());
	vector<vector<int> > dp(s.size(), vector<int>(s.size(), 0));
	lcs(s, a, dp);
	string ans = "";
	int i = s.size() - 1;
	int j = s.size() - 1;
	//cout << dp[i][j] << endl;
	while ( (!(i < 0 && j < 0)))
	{
		if (dp[i][j] == 0)
			break;
		if (j - 1 >= 0 && dp[i][j] == dp[i][j - 1])
		{
			j = j - 1;
		}
		else if (i - 1 >= 0 && dp[i][j] == dp[i - 1][j])
		{
			i = i - 1;
		}
		else
		{
			ans = s[i] + ans;
			i = i - 1;
			j = j - 1;
		}
	}
	cout << ans << endl;

	return 0;
}