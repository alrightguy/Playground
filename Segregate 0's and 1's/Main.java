
// 1. Segregate 0's and 1's
// QUESTION 1 OF 1
// Segregate 0's and 1's
// Given a pattern 0’s and 1’s, can you move all the 1’s to the beginning and 0’s to the end?
// Input Format

// In an input array 0 and 1 are in an unsorted order.

// Output Format

// The output is sorted order of 0 and 1.

// Sample Input:

// 010101011001

// Sample Output:

// 111111000000
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
   
    string s;
    cin>>s;
    int c0=0,c1=0,i;
    for(i=0;i<s.size();i++)
    {
        if(s[i]=='0')
            c0++;
        else
            c1++;  
    }
    while(c1>0)
    {
        cout<<1;
        c1--;
    }
    while(c0>0)
    {
        cout<<0;
        c0--;
    }
    return 0;
}