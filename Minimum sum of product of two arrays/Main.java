// Minimum sum of product of two arrays
// Find the minimum sum of products of two arrays of the same size, given that k modifications are allowed on the first array. In each modification, one array element of the first array can either be increased or decreased by 2.
// Sample Input:

// 5

// 1 2 3 4 5

// 1 2 3 4 5

// 2

// Sample Output:

// 35

// Case 1
// Input (stdin)
// 5
// 1 2 3 4 5
// 1 2 3 4 5
// 2

// Output (stdout)
// 35
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
	ll n, i;
	cin >> n;
	vector<ll>arr(n, 0);
	vector<ll>arr2(n, 0);
	for (i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	for (i = 0; i < n; i++)
	{
		cin >> arr2[i];
	}
	ll k;
	cin >> k;
	vector<ll>arr3(n, 0);
	ll sum_of_product = 0, ci = 0;
	for (i = 0; i < n; i++)
	{
		arr3[i] =  arr[i] * arr2[i];
		sum_of_product =  sum_of_product + arr3[i];
	}
	ll ans = INT_MAX, temp;
	for (i = 0; i < n; i++)
	{
		temp = sum_of_product - arr3[i] +  min( arr2[i] *(arr[i] - (k * 2)),arr2[i]*(arr[i] + (k * 2)) );
		if (temp < ans)
			ans = temp;
	}
	cout << ans << endl;
	return 0;
}