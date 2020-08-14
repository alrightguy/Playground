#include<bits/stdc++.h>
using namespace std;
void bfs(vector<int>adj[],vector<int>&vis,int s)
{
  queue<int>q;
  q.push(s);
  while(!q.empty())
  {
    int u = q.front();
    cout<<u<<" ";
    q.pop();
    for(int i=adj[u].size()-1;i>=0;i--)
    {
      if(vis[adj[u][i]]==0)
      {
        vis[adj[u][i]]=1;
        q.push(adj[u][i]);
      }
    }
  }
}
int main()
{
  //Type your code here
  int n,i = 0,j = 0;
  cin>>n;
  if(n==0)
  {
    cout<<"Graph doesn't exist"<<endl;
    return 0;
  }
  vector<int>adj[n];
  cin>>i>>j;
  while(i!=-1 && j!=-1)
  {
    adj[i].push_back(j);
    adj[j].push_back(i);
    cin>>i>>j;
  }
  vector<int>vis(n,0);
  cout<<"BFS :  ";
  vis[0]=1;
   bfs(adj,vis,0);

  return 0;
}