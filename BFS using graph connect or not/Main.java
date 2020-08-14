#include<bits/stdc++.h>
using namespace std;
int t = 0;
bool compare(pair<int, int>a1, pair<int, int>a2)
{
  return a1.second < a2.second;
}
void dfs(vector<int>adj[], vector<int>&vis, int s,  vector<pair<int, int> >&fin)
{
  int i;
  t++;
  for (i = 0; i < adj[s].size(); i++)
  {
    if (vis[adj[s][i]] == 0)
    {
      vis[adj[s][i]] = 1;
      dfs(adj, vis, adj[s][i], fin);
    }
  }
  t++;

  fin.push_back({t, s});
}
void dfs2(vector<int>adj[], vector<int>&vis, int s)
{
  for (int i = 0; i < adj[s].size(); i++)
  {
    if (vis[adj[s][i]] == 0)
    {
      vis[adj[s][i]] = 1;
      dfs2(adj, vis, adj[s][i]);
    }
  }
}
int main()
{
  //Type your code here
  int n, i = 0, j = 0, e, a, b;
  cin >> n >> e;
  vector<int>adj[n];
  vector<int>adjt[n];
  for (i = 0; i < e; i++)
  {
    cin >> a >> b;
    adj[a].push_back(b);
    adjt[b].push_back(a);

  }
  vector<int>vis(n, 0);
  vector<pair<int, int> >fin;
  for (i = 0; i < n; i++)
  {
    if (vis[i] == 0)
    {
      vis[i] = 1;
      dfs(adj, vis, i, fin);
    }
  }
  sort(fin.begin(), fin.end(), compare);
  for (i = 0; i < n; i++)
  {
    vis[i] = 0;
  }
  int ans = 0;
  for (i = 0; i < n; i++)
  {
    if (vis[fin[i].second] == 0)
    {
      ans++;
      vis[fin[i].second] = 1;
      dfs2(adjt, vis, fin[i].second);
    }
  }
  if (ans == 1)
    cout << "Yes" << endl;
  else
    cout << "No" << endl;
  return 0;
}