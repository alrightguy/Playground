// Number of Islands
// Given a matrix that consists of 1's and 0's where 1 represents land and 0 represents water. Connected lands surrounded by water is an island. Land can be connected in all 8 directions. Find the minimum of the bridges required to connect all the Islands. 
// Input Format

// The first line contains the size of 2D matrix

// The next line contains the elements of 2D matrix

// Output Format

// The output consists of the number of islands

// Refer the sample output for formatting

// Sample Input:

// 5 5

// 1 1 0 0 0

// 0 1 0 0 1

// 1 0 0 1 1

// 0 0 0 0 0

// 1 0 1 0 1

// Sample Output:

// 4

#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int x1[] ={-1,-1,0,1,1,1,0,-1};
int m1[] ={0,1,1,1,0,-1,-1,-1};
void dfs(vector< vector<int> >mat,vector< vector<int> >&vis,ll i,ll j)
{
    for(int k = 0;k<8;k++)
    {
        ll x = i + x1[k];
        ll y = j + m1[k];
        if( (x>=0 && x<mat.size()) && (y>=0 && y<mat[0].size()) )
        {
            if(mat[x][y]==1 && vis[x][y]==0)
            {
                vis[x][y]=1;
                dfs(mat,vis,x,y);
            }
        }
    }
}
int main() 
{ 
    ll i,j,r,c;
    cin>>r>>c;
    vector< vector<int> >mat(r,vector<int>(c,0));
    vector< vector<int> >vis(r,vector<int>(c,0));
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        cin>>mat[i][j];             
      }       
    }
    ll count = 0;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(vis[i][j]==0 && mat[i][j] == 1)
            {
               // cout<< i<<" "<<j<<endl;
                vis[i][j] = 1;
                dfs(mat,vis,i,j);
                count++;
            }         
        }      
    }
    count--;
    cout<<count<<endl;
    return 0;
}