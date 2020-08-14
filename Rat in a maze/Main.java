#include<bits/stdc++.h>
using namespace std;
#define pb push_back
void number_of_paths(int**maze,int i,int j,int*ans,int n)
{
  if(i==j && j==n)
  {
    (*ans)++;
  }
  else
  {
    if(i+1<=n && maze[i+1][j]==0)
    {
      maze[i+1][j] = 1;
      number_of_paths(maze,i+1,j,ans,n);
      maze[i+1][j] = 0;
    }
    if(j+1<=n && maze[i][j+1]==0)
    {
       maze[i][j+1] = 1;
       number_of_paths(maze,i,j+1,ans,n);
       maze[i][j+1] = 0;
    }
    if(i-1>=0 && maze[i-1][j]==0)
    {
       maze[i-1][j] = 1;
       number_of_paths(maze,i-1,j,ans,n);
       maze[i-1][j] = 0;
    }
    maze[i][j]=0;
  }
}
int main()
{
  int n,i,j;
  cin>>n;
  int ** maze = new int*[n];
  for(i = 0;i<=n;i++)
  {
    maze[i] = new int[n];
  }
  for(i = 0;i<n;i++)
  {
    for(j = 0;j<n;j++)
    {
      cin>>maze[i][j];
     // cout<<maze[i][j]<<" ";
    }
  }
  int ans =0;
  maze[0][0] = 1;
  number_of_paths(maze,0,0,&ans,n-1);
  cout<<ans<<endl;     
}