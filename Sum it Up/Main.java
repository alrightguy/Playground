// Sum it Up
// In the modern era, with the massive digital transformations happening around, we have all forgotten the sole purpose of computers. If you had not known it, computers were indeed created to perform mathematical operations. So, for once, let's make the computer count for us! Ultimately, that's what they were created for. Write a simple algorithm where you ask the computer to calculate the sum of all digits in a number until the sum itself is a single digit. 
// Input Format

// The input consists of an integer

// Output Format

// The output consists of single digit integer.

// Constraints

// 1 <= n <= 1010

// Refer the sample output for formatting

// Sample Input

// 98

// Sample Output

// 8

// Explanation

// 9 + 8 = 17

// 1 + 7 = 8
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
    int sum = 0;
    while(n>=10)
    {
        sum = 0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        n = sum;
    }
    cout<<n<<endl;
    return 0;
}