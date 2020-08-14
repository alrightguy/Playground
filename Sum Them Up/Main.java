#include<iostream>
using namespace std;
int main()
{
    int r,c;
    cin>>r>>c;
    int mat[r][c];
    
    for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        int temp;
        cin>>temp;
        mat[i][j]=0;
        mat[i][j]+=temp;
      }
    }
   for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        int temp;
        cin>>temp;
        mat[i][j]+=temp;
      }
    }
    for(int i = 0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        cout<<mat[i][j]<<" ";
      }
      cout<<endl;
    }
  return 0;
}