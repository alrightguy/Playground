// Binary Search tree - Sum of leaf nodes
// Write a program to sum all the leaf node elements in a tree.



// Sample Input:

// 6

// 3

// 1

// 4

// 2

// -1



// Sample Output:

// Sum of all leaf nodes are 6


// Case 1
// Case 2
// Input (stdin)
// 6
// 3
// 1
// 4
// 2
// -1

// Output (stdout)
// Sum of all leaf nodes are 6

#include<bits/stdc++.h>
using namespace std;
#define pb push_back
class node {
public:
  int val;
  node*left = NULL;
  node*right = NULL;
};
int get_sum(node*root)
{
  if (root == NULL)
    return 0;
  else if (root->left == NULL && root->right == NULL)
    return root->val;
  else
  {
    return get_sum(root->left) + get_sum(root->right);
  }

}
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
  int sum = 0;
  sum = get_sum(root);
  cout << "Sum of all leaf nodes are " << sum;
}