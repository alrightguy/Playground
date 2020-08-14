// Policemen - Thieves
// Given array of size n has the following specifications: Each element in the array contains either a policeman or a thief, each policeman can catch only one thief, a policeman cannot catch a thief who is more than K units away from the policeman. We need to find the maximum number of thieves that can be caught.
// Sample Input

// 6

// P

// T

// P

// T

// T

// P

// 3

// Sample Output

// Maximum thieves caught: 3
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int  main()
{
	int n;
	cin >> n;
	vector<int>arrp;
    vector<int>arrt;
	char t;
	for (int i = 0; i < n; i++)
	{
		cin >> t;
		if(t=='P')
          arrp.pb(i);
        else
          arrt.pb(i);
	}
	int k, i;
	cin >> k;
	int ans = 0;
	int p = 0,q = 0;
    while(p<arrp.size() && q<arrt.size())
    {
       if(abs(arrp[p] - arrt[q])<=k)
       {
         ans++;
         p++;
         q++;
       }
      else {
        if(arrp[p]<arrt[q])
          p++;
        else
          q++;
       }
    }
	cout<<"Maximum thieves caught: "<< ans << endl;
	return 0;
}