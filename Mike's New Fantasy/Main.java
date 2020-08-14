// Mike's New Fantasy
// Mike was never into math until today. What changed today? Ever heard of a song that is based on the Fibonacci series? Even a math hater would be fascinated by it, right? So is Mike. Mike recently came across the song Lateralus by the American band Tool. When he knew the number of syllables in the lyrics of the verse follows the Fibonacci series, boom 🤯! He was just blown away. All curious Mike now wants to understand the Fibonacci series. ProGrad, could you write a Fibonacci series based algorithm for Mike? 
// Input Format

// The input consists of an integer

// Output Format

// The output consists of an integer.

// Constraints

// 1 <= n <= 70

// Refer the sample output for formatting

// Sample Input

// 5

// Sample Output

// 3
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
    
    int n;
    cin>>n;
    vector<ll>dp(n+1,0);
    dp[0] = 0;dp[1] = 1;
    for(int i=2;i<=n;i++)
    {
        dp[i] = dp[i-1]+dp[i-2];      
    }
    cout<<dp[n-1];
    return 0;
}