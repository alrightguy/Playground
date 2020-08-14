// Activity selection problem
// In activity selection problem, we are given a set of activities and the starting & finishing time of each activity, we need to find the maximum number of activities that can be performed by a single person assuming that a person can only work on a single activity at a time.
// Sample Input

// 4

// 1 3 1 5

// 2 5 6 7

// Sample Output

// 0 1 3

// Case 1
// Input (stdin)
// 4
// 1 3 1 5
// 2 5 6 7
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
class Activity
{
public:
	int st,  ft,  id;
};
bool compare(Activity a, Activity b)
{
	return a.ft < b.ft;
}
int main()
{
	int n, i;
	cin >> n;
	Activity arr[n];
	for (i = 0; i < n; i++)
	{
		int temp;
		cin >> temp;
		arr[i].st = temp;
		arr[i].id = i;
	}
	for (i = 0; i < n; i++)
	{
		int temp;
		cin >> temp;
		arr[i].ft = temp;
	}
	sort(arr, arr + n, compare);
	cout << arr[0].id << " ";
	int f = arr[0].ft;
	for (i = 1; i < n; i++)
	{
		if (arr[i].st >= f)
		{
			cout << arr[i].id << " ";
			f = arr[i].ft;
		}
	}
	cout << endl;
	return 0;
}