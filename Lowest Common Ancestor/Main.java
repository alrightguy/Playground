// Lowest Common Ancestor
// Given an array of N integers, construct a BST. Given two nodes M and N. Find the lowest common ancestor. Note: If M and N is not in BST, print -1



// Input Format

// The first line consists of length of array size n

// The second line consists of array elements

// The last line consists of M and N value in BST.



// Output Format

// Output consists of LCA of M and N.



// ﻿Refer the sample output for formatting

// Sample Input:

// 7

// 20 8 4 12 10 14 22

// 8 22

// Sample Output:

// 20


// Case 1
// Case 2
// Input (stdin)
// 7
// 20 8 4 12 10 14 22
// 15 8

// Output (stdout)
// -1
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
int lca(node*root, int m, int n)
{
  if (root != NULL)
  {
    if (m < root->val &&  n < root->val)
    {
      lca(root->left, m, n);
    }
    else if (m > root->val && n > root->val)
    {
      lca(root->right, m, n);
    }
    else
    {
      return root->val;
    }
  }
}
bool ser(node *root, int target)
{
  if (root != NULL)
  {
    if (root->val == target)
      return true;
    else
    {
      if (target < root->val)
      {
        if (ser(root->left, target))
          return true;
        else
          return false;
      }
      else
      {
        if (ser(root->right, target))
          return true;
        else
          return false;
      }
    }
  }
  return false;
}
int main()
{
  int temp;
  cin >> temp;
  node * root = NULL;
  while (temp--)
  {
    int a;
    cin >> a;
    insertbst(&root, a);
  }
  int m, n;
  cin >> m >> n;
  if (ser(root, m) == false || ser(root, n) == false)
  {
    cout << -1 << endl;
  }
  else
    cout << lca(root, m, n);
}