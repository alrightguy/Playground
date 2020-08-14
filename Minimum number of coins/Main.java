// Minimum number of coins
// Given a value N, if we want to make a change for N Rs, and we have an infinite supply of each of the denominations in Indian currency, i.e., we have an infinite supply of {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, what is the minimum number of coins and/or notes needed to make the change?
// Sample Input

// 1230

// Sample Output

// 1000 100 100 20 10

// Case 1
// Input (stdin)
// 1230

// Output (stdout)
// 1000  100  100  20  10
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;

int min_num(int *arr, int target)
{
	int i, j;
	int dp[10][target + 1];
	for (int i = 0; i < 9; i++)
	{
		dp[i][0] = 0;
	}
	for (i = 0; i < 9; i++)
	{
		for (j = 1; j <= target; j++)
		{
			if (j < arr[i])
				dp[i][j] = dp[i - 1][j];
			else
			{
				if (i - 1 >= 0)
					dp[i][j] = min(dp[i - 1][j], 1 + dp[i][j - arr[i]]);
				else
				{
					dp[i][j] = 1 + dp[i][j - arr[i]];
				}
			}
		}
	}
	int k = 8, p = target;
	while (p != 0)
	{
		if (k >= 1 && dp[k][p] == dp[k - 1][p])
		{
			k = k - 1;
		}
		else
		{
			cout << arr[k] << "  ";
			p = p - arr[k];
		}
	}
}
int main()
{
	int coins[] =  {1, 2, 5, 10, 20, 50, 100, 500, 1000};
	int target;
	cin >> target;
	int ans = min_num(coins, target);
	//cout << ans << endl;
	return 0;
}