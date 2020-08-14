// Binary Search
// Write a program to search an element using Binary Search in a sorted array. Given a sorted array, find the search element and print its position. Print "Not found" if the element is not present in an array.
// Input Format

// The first line of input will be the size of array say n, and followed by n elements.

// The last line of input will be the element to be searched.

// Output Format

// Print the value of the element

// Constraints:

// 1<= N <=1000

// 1<= Ai <=10000

// Refer the sample output for formatting

// Sample Input

// 6

// 1 6 8 9 11 15

// 6

// Sample Output

// 1
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
    int n,i;
    cin>>n;
    vector<int>arr(n,0);
    for(i=0;i<n;i++)
    {
      cin>>arr[i];          
    }
    int target;
    cin>>target;
    int beg = 0,end = n-1;
    while(beg<=end)
    {
        int mid = beg + (end-beg)/2;
        if(arr[mid]==target)
        {
            cout<<mid;
            return 0;
        }
        else
        {
            if(arr[mid]>target)
                end = mid-1;
            else
                beg = mid+1;
        }
    }
    cout<<"Not found"<<endl;
    return 0;
}