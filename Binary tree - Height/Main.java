// Binary tree - Height
// Write a Program to find the depth or height of the tree.



// Sample Input:

// 6

// 3

// 1

// 4

// 2

// -1



// Sample Output:

// Height of the tree is 4


// Case 1
// Case 2
// Input (stdin)
// 6
// 3
// 1
// 4
// 2
// -1
//Sample Output:
//Height of the tree is 4
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
void insertbst(node**root, int data)
{
  if (*root == NULL)
  {
    node * newnode = new node;
    newnode->val = data;
    (*root) = newnode;
  }
  else
  {
    node * prev, *temp;
    prev = NULL;
    temp = (*root);
    while (temp != NULL)
    {
      prev = temp;
      if (data <= temp->val)
        temp = temp->left;
      else
        temp = temp->right;
    }
    node * newnode = new node;
    newnode->val = data;
    if (data <= prev->val)
    {
      prev->left = newnode;
    }
    else
      prev->right = newnode;
  }
}
int height(node *root)
{
  if (root == NULL)
  {
    return 0;
  }
  else
  {
    return 1 + max( height(root->left), height(root->right));
  }
}
int main()
{
  int temp;
  cin >> temp;
  node * root = NULL;
  while (temp != -1)
  {
    insertbst(&root, temp);
    cin >> temp;
  }

  int ans = height(root);
  cout << "Height of the tree is " << ans;
}