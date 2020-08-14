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

    int n,i;
    cin>>n;
    vector<int>arr(n,0);
    for(i=0;i<n;i++)
    {
    	cin>>arr[i];		
    }
    int target;
    cin>>target;
    sort(arr.begin(),arr.end());
    int beg = 0,end = n-1;
    while(beg<=end)
    {
    	int mid = beg + (end-beg)/2;
    	if(arr[mid]==target)
    	{
    		cout<<"She passed her exam"<<endl;
    		return 0;
    	}
    	else
    	{
    		if(target>arr[mid])
    			beg = mid+1;
    		else
    			end = mid-1;
    	}
    }
    cout<<"She failed"<<endl;

	return 0;
}