#include<bits/stdc++.h>
using namespace std;
void dfs(vector<int>adj[],vector<int>&vis,int s)
{
  int i;
  cout<<s<<" ";
  for(i=adj[s].size()-1;i>=0;i--)
  {
    if(vis[adj[s][i]]==0)
    {
      vis[adj[s][i]] = 1;
      dfs(adj,vis,adj[s][i]);
    }
  }
}
int main()
{
  //Type your code here
  int n,i = 0,j = 0;
  cin>>n;
  vector<int>adj[n];
  cin>>i>>j;
  while(i!=-1 && j!=-1)
  {
    adj[i].push_back(j);
    adj[j].push_back(i);
    cin>>i>>j;
  }
  vector<int>vis(n,0);
  cout<<"DFS : ";
  for(i = 0;i<n;i++)
  {
    if(vis[i]==0)
    {
      vis[i] = 1;
      dfs(adj,vis,i);
    }
  }
  return 0;
}