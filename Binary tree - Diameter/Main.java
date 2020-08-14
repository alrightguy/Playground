// Binary tree - Diameter
// Write a program to find the diameter of a binary tree.



// Sample Input:

// 1

// 2

// 3

// 4

// 5

// -1



// Sample Output:

// Diameter of the given binary tree is 4


// Case 1
// Case 2
// Input (stdin)
// 1
// 2
// 3
// 4
// 5
// -1

// Output (stdout)
// Diameter of the given binary tree is 4
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define f first
#define s second
class node {
public:
  int val;
  node*left = NULL;
  node*right = NULL;
};
void insertbt(node**root, vector<int>& arr, int i)
{

  if (*root == NULL)
  {
    node * newnode = new node;
    newnode->val = arr[i];
    (*root) = newnode;
  }
  else
  {
    (*root)->val = arr[i];
  }
  if (2 * i + 1 < arr.size())
  {
    node * nodeleft = new node;
    (*root)->left = nodeleft;
    insertbt(&nodeleft, arr, 2 * i + 1);
  }
  if (2 * i + 2 < arr.size())
  {
    node * noderight = new node;
    (*root)->right = noderight;
    insertbt(&noderight, arr, 2 * i + 2);
  }

}
pair<int, int> diameter(node *root)
{
  if (root == NULL)
  {
    return {0, 0};
  }
  else
  {
    pair<int, int>temp;
    pair<int, int>temp1;
    pair<int, int>temp2;
    temp1 = diameter(root->left);
    temp2 = diameter(root->right);
    temp.f = max(temp1.f , temp2.f) + 1;
    temp.s = max(temp1.f + temp2.f + 1, max(temp1.s, temp2.s));
    return temp;
  }
}
int main()
{
  int temp;
  cin >> temp;
  node * root = NULL;
  vector<int>arr;
  while (temp != -1)
  {
    arr.pb(temp);
    cin >> temp;
  }
  insertbt(&root, arr, 0);
  pair<int, int> ans = diameter(root);
  cout <<"Diameter of the given binary tree is "<< ans.s;
}