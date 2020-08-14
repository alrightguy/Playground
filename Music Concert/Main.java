// Music Concert
// Sid Sriram's concert is going to happen by this week. Event coordinators have sold all tickets, odd number tickets are given to males and even number tickets are given to females. Finally, they need a count of males and females to allocate seats separately in the auditorium.
// Note: Use dynamic memory allocation

// Input Format:

// The first input contains an integer which denotes the total number of tickets

// The remaining 'n' input denotes the ticket numbers

// Output Format:

// Print the count of male

// Print the count of female

// Sample Input:

// 5

// 67 89 34 56 33

// Sample Output:

// 3

// 2
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
    int * arr = (int*)malloc(n*sizeof(int));
    int c_m = 0,c_f = 0;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(arr[i]%2==0)
            c_f++;
        else
            c_m++;        
    }
    cout<<c_m<<endl<<c_f;
    return 0;
}

