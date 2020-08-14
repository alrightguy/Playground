// Robert - The Smart Kid
// Robert is 5 years old. Topper at academics, sports, extracurriculars and what not. 
//That's a lot of achievement for a 5-year-old kid, isn't it? 
//Well, the fact is he's intellectually gifted. However, at school, he was treated no differently from others. Recently, Robert's Math teacher has given him homework to calculate the sum of n natural numbers. While the other kids out there are finger counting, Robert decides to write an algorithm to do this. Could you help him out with this? 
// Input Format

// The input consists of an integer

// Output Format

// The output consists of an integer.

// Constraints

// 1 <= n <= 1016

// Refer the sample output for formatting

// Sample Input

// 5

// Sample Output

// 15
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
    
    ll n;
    cin>>n;
    ll  ans = (n*(n+1))/2;
    cout<<ans<<endl;
    return 0;
}