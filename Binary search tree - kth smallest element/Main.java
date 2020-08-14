// Binary search tree - kth smallest element
// Write a program to find the kth smallest element of a binary search tree.



// Sample Input:

// 50

// 30

// 20

// 40

// 70

// 60

// 80

// -1

// 4



// Sample Output:

// Enter the kth value:

// Smallest kth value 50


// Case 1
// Case 2
// Input (stdin)
// 50
// 30
// 20
// 40
// 70
// 60
// 80
// -1
// 4

// Output (stdout)
// Enter the kth value:
// Smallest kth value 50
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
void inorder(node *root, vector<int>&arr, int n)
{
  if (root != NULL)
  {
    inorder(root->left, arr, n);
    arr.pb(root->val);
    if (arr.size() == n)
    {
      return ;
    }
    inorder(root->right, arr, n);
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
  vector<int>arr;
  int n;
  cout << "Enter the kth value:" << endl;
  cin >> n;
  inorder(root, arr, n);
  cout << "Smallest kth value ";
  cout << arr[n - 1] << endl;
}