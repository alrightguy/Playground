#include<iostream>
using namespace std;
int main()
{
    int r,c;
  	cin>>r>>c;
    int mat[r][c];
  	for(int i=0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        cin>>mat[i][j];
      }
    }
  int mat2[c][r];
  for(int i=0;i<r;i++)
    {
      for(int j = 0;j<c;j++)
      {
        mat2[j][i] = mat[i][j];
      }
    }
     for(int i=0;i<c;i++)
    {
      for(int j = 0;j<r;j++)
      {
        cout<<mat2[i][j]<<" ";
      }
    cout<<endl;
    }
  return 0;
  
}