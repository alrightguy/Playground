#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int helper(vector<int>&arr,vector<int>&dp,int index)
{
   if(index>=arr.size())
       return 0;
   if(dp[index]!=-1)
       return dp[index];
   else
   {
      int t1 = arr[index] + helper(arr,dp,index+2);
      int t2 = helper(arr,dp,index+1);
      dp[index] = max(t1,t2);
      return dp[index];
   }
}
int main() 
{ 
    int n,i;
    cin>>n;
    vector<int>arr(n,0);
    for(i=0;i<n;i++)
    {
        cin>>arr[i];      
    }
    vector<int>dp(n,-1);
    int ans = helper(arr,dp,0);
    cout<<ans<<endl;
    return 0;
}