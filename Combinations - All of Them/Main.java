// Combinations - All of Them
// Now, Mr. John needs some help in writing a similar algorithm like that of the permutations for the concept of combinations too. Could you help him out with this? 
// Input Format

// The first line consists of the size of an array

// The second line consists of array of elements separated by space

// Output Format

// Print all the combinations of the given array

// Constraints

// 1 <= N <= 100

// Refer the sample output for formatting

// Sample Input:

// 2

// 10 20

// Sample Output:

// 10,20

// 10,

// 20,

#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
void print_all(vector<int> s,int i,vector <int>v)
{
    if(i==s.size())
    {
      for(int j = 0;j<v.size();j++)
      {
        cout<<v[j]<<",";
      }
      cout<<endl;
    }
    else
    {
        vector<int>m = v;
        m.pb(s[i]);
        print_all(s,i+1,m);
        print_all(s,i+1,v);
    }
}
int main() 
{ 
    int n;
    cin>>n;
    vector<int>s(n,0);
    for(int i = 0;i<n;i++)
      cin>>s[i];
    vector<int>v;
    print_all(s,0,v);
    return 0;
}