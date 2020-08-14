// Finding factors is real hard

// The input consists of an integer

// Output Format

// The output consists of the factors of the number separated by space.

// Constraints

// 1 <= n <= 1010

// Refer the sample output for formatting

// Sample Input

// 10

// Sample Output

// 1 2 5 10
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
int main() 
{ 
    

    vector<int>arr;
    int n,i;
    cin>>n;
    for(i=1;i<=sqrt(n);i++)
    {
      if(n%i==0)
      {
        arr.pb(i);
        if(i!=sqrt(n))
            arr.pb(n/i);
      }           
    }
    sort(arr.begin(),arr.end());
    for(i=0;i<arr.size();i++)
    {
        cout<<arr[i]<<" ";      
    }
    return 0;
}