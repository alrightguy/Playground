// Getting Dizzy
// Given an integer matrix, R x C, traverse it as shown below: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

// Input Format

// One line containing two integers R and C representing the dimensions of the matrix M as rows R, and columns C, respectively.

// R lines, each containing C space separated number of integers which collectively form the matrix data.

// Output Format

// Single line containing integers without space representing the desired traversal.

// Constraints

// 0<R,C<500

// Refer the sample output for formatting

// Sample Input:

// 3

// 1 2 3

// 4 5 6

// 7 8 9



// Sample Output:

// 1 2 3 6 9 8 7 4 5




// Case 1
// Case 2
// Input (stdin)
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output (stdout)
// 1 2 3 6 9 8 7 4 5
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
  cin >> n;
  int i, j, k;
  vector<vector<int> > arr(n, vector<int>(n, 0));
  for (i = 0; i < n; i++)
  {
    for (j = 0; j < n; j++)
    {
      cin >> arr[i][j];
    }
  }
  for (i = 0; i < (n + 1) / 2; i++)
  {
    for (j = i; j <= n - 1 - i; j++)
    {
      cout << arr[i][j]<<" ";

    }
    j = n - 1 - i;
    for (k = i + 1; k <= n - 1 - i; k++)
    {
      cout << arr[k][j]<<" ";
    }
    k = n - 1 - i;
    for (j = n - 1 - i - 1; j >= i; j--)
    {
      cout << arr[k][j]<<" ";
    }
    j = i;
    for (k = n - i - 1 - 1; k > i; k--)
    {
      cout << arr[k][j]<<" ";
    }
  }
  return 0;
}