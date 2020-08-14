#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,e,i,j;
  cout<<"Enter the number of vertices:"<<endl;
  cin>>n;
  cout<<"Enter the number of edges:"<<endl;
  cin>>e;
  vector<int>adj[n];
  for(i = 0;i<e;i++)
  {
    int a,b;
    cin>>a>>b;
    cout<<"Enter the Start node and End node of edge "<<i+1<<endl;
    adj[a].push_back(b);
    adj[b].push_back(a);
  }
  cout<<"Adjacency List:"<<endl;
  for(i = 0;i<n;i++)
  {
    cout<<i<<"--->";
    for(j = 0;j<adj[i].size();j++)
    {
      cout<<adj[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
}