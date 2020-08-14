//Does a perfect number exist?
// Some numbers are odd. Some are even. Some are rational and some are not. Some are seemingly positive while others aren't. A lot is going on with numbers, isn't it? Not even humans could be categorized that well. Anyway, the question is - does a perfect number exist? Find it out and write an algorithm for one. Note: A perfect number is a positive integer that is equal to the sum of its proper positive divisors except the given number.
// Input format:

// The input containing an integer 'n' which denotes the given number

// Output format:

// If given number is the perfect number, then print "Yes". Otherwise, print "No".

// Constraints

// 1 <= n <= 1010

// Refer the sample output for formatting.

// ﻿Sample Input

// 6

// Sample Output

// Yes

// Explanation

// ( 1 + 2 + 3 = 6 )
  
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
    vector<ll>arr;
    ll n,i;
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
    ll sum = 0;
    for(i=0;i<arr.size();i++)
    {
         sum = sum+arr[i];
    }
    sum = sum-n;
    if(sum==n)
      cout<<"Yes"<<endl;
    else
      cout<<"No"<<endl;
    return 0;
}