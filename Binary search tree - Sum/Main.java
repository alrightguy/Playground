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
int get_sum(node*root)
{
  if(root==NULL)
    return 0;
  else
  {
    return root->val + get_sum(root->left)+get_sum(root->right);
  }
}
int main()
{
  //type your code
  int temp;
  cin >> temp;
  node * root = NULL;
  while (temp!=-1)
  {
    insertbst(&root, temp);
    cin>>temp;
  }
  int sum = get_sum(root);
  cout<<"Sum of all nodes are "<<sum<<endl;
  return 0;
}