//merge_sort
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;

void merge(vector<int>&arr, int b, int mid, int e)
{
	vector<int>temp(e - b + 1, 0);
	int k = 0, j = mid + 1, i = b;
	while (i <= mid && j <= e)
	{
		if (arr[i] <= arr[j])
			temp[k++] = arr[i++];
		else
			temp[k++] = arr[j++];
	}
	while (i <= mid)
	{
		temp[k++] = arr[i++];
	}
	while (j <= e)
	{
		temp[k++] = arr[j++];
	}
	for (i = b, k = 0; i <= e; i++)
	{
		arr[i] = temp[k++];
	}
}

void merge_sort(vector<int>&arr, int b, int e)
{
	if (b < e)
	{
		int mid = (b + e) / 2;
		merge_sort(arr, b, mid);
		merge_sort(arr, mid + 1, e);
		merge(arr, b, mid, e);
	}
}

int main()
{
	int n, i;
	cin >> n;
	vector<int>arr(n, 0);
	cout << "Before Sort:" << endl;
	for (i = 0; i < n; i++)
	{
		cin >> arr[i];
		cout << arr[i] << " ";
	}
	cout << endl;
	merge_sort(arr, 0, n - 1);
	cout << "After Sort:" << endl;
	for (i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
	return 0;
}