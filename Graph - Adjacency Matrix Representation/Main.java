#include <iostream>
using namespace std;

int main()
{
  int n,e,i,j;
  cout<<"Please enter the number of nodes in the graph"<<endl;
  cin>>n;
  cout<<"Please enter the number of edges in the graph"<<endl;
  cin>>e;
  string s;
  cout<<"Is the graph directed"<<endl;
  cin>>s;
  cout<<"Adjacency Matrix Representation:"<<endl;
   int mat[n][n];
  for(i = 0;i<n;i++)
  {
    for(j = 0;j<n;j++)
    {
      mat[i][j] = 0;
      cout<<0<<" ";
    }
    cout<<endl;
  }
  for(i = 0;i<e;i++)
  {
    int a,b,w;
    cout<<"Enter the start node, end node and weight of edge no "<<i+1<<endl;
    cin>>a>>b>>w;
    if(s=="yes")
    {
      mat[a-1][b-1] = w;
    }
    else
    {
      mat[a-1][b-1] = w;
      mat[b-1][a-1] = w;
    }
  }
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(i = 0;i<n;i++)
  {
    for(j = 0;j<n;j++)
    {
      cout<<mat[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
}